/*
 *
 *    Copyright IBM Corp. 2022
 *
 */
package com.ibm.cics.cip.bankliberty.datainterfaces;
import com.ibm.jzos.fields.*;
import java.math.*;

// Generated by IBM Record Generator for Java V3.0.0 Build 20170904-1704 on: Tue Nov 21 08:04:12 GMT 2017


public class PROCTRAN {

    static final String COPYRIGHT =
      "Copyright IBM Corp. 2022";


	protected static CobolDatatypeFactory factory = new CobolDatatypeFactory();
	static { factory.setStringTrimDefault(false); } 

	/** <pre>
	 01 COBOL-LANGUAGE-STRUCTURE. </pre> */
	public static final int COBOL_LANGUAGE_STRUCTURE_LEN = 99; 

	/** <pre>
	     03 PROC-TRAN-DATA. </pre> */
	public static final int PROC_TRAN_DATA_LEN = 99; 
	public static final int PROC_TRAN_DATA_OFFSET = factory.getOffset();

	/** <pre>
	        05 PROC-TRAN-EYE-CATCHER        PIC X(4). </pre> */
	protected static final StringField PROC_TRAN_EYE_CATCHER = factory.getStringField(4);

	/** <pre>
	        88 PROC-TRAN-VALID VALUE 'PRTR'. </pre> */
	public static final String PROC_TRAN_VALID = "PRTR";

	/** <pre>
	        05 PROC-TRAN-LOGICAL-DELETE-AREA REDEFINES
	           PROC-TRAN-EYE-CATCHER. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_EYE_CATCHER.getOffset()); } 
	public static final int PROC_TRAN_LOGICAL_DELETE_AREA_LEN = 4; 
	public static final int PROC_TRAN_LOGICAL_DELETE_AREA_OFFSET = factory.getOffset();

	/** <pre>
	           07 PROC-TRAN-LOGICAL-DELETE-FLAG PIC X. </pre> */
	protected static final StringField PROC_TRAN_LOGICAL_DELETE_FLAG = factory.getStringField(1);

	/** <pre>
	           88 PROC-TRAN-LOGICALLY-DELETED VALUE X'FF'. </pre> */
	/** NOTE: this constant value form is not supported */

	/** <pre>
	           07 FILLER PIC X(3). </pre> */
	protected static final StringField FILLER_1 = factory.getStringField(3);
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-ID. </pre> */
	public static final int PROC_TRAN_ID_LEN = 14; 
	public static final int PROC_TRAN_ID_OFFSET = factory.getOffset();

	/** <pre>
	           07 PROC-TRAN-SORT-CODE       PIC 9(6). </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_SORT_CODE = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	           07 PROC-TRAN-NUMBER          PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_NUMBER = factory.getExternalDecimalAsIntField(8, false, false, false, false);

	/** <pre>
	        05 PROC-TRAN-DATE               PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_DATE = factory.getExternalDecimalAsIntField(8, false, false, false, false);

	/** <pre>
	        05 PROC-TRAN-DATE-GRP REDEFINES PROC-TRAN-DATE. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_DATE.getOffset()); } 
	public static final int PROC_TRAN_DATE_GRP_LEN = 8; 
	public static final int PROC_TRAN_DATE_GRP_OFFSET = factory.getOffset();

	/** <pre>
	           07 PROC-TRAN-DATE-GRP-YYYY   PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_DATE_GRP_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	           07 PROC-TRAN-DATE-GRP-MM     PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_DATE_GRP_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	           07 PROC-TRAN-DATE-GRP-DD     PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_DATE_GRP_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-TIME               PIC 9(6). </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_TIME = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	        05 PROC-TRAN-TIME-GRP REDEFINES PROC-TRAN-TIME. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_TIME.getOffset()); } 
	public static final int PROC_TRAN_TIME_GRP_LEN = 6; 
	public static final int PROC_TRAN_TIME_GRP_OFFSET = factory.getOffset();

	/** <pre>
	           07 PROC-TRAN-TIME-GRP-HH     PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_TIME_GRP_HH = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	           07 PROC-TRAN-TIME-GRP-MM     PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_TIME_GRP_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	           07 PROC-TRAN-TIME-GRP-SS     PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_TIME_GRP_SS = factory.getExternalDecimalAsIntField(2, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-REF                PIC 9(12). </pre> */
	protected static final ExternalDecimalAsLongField PROC_TRAN_REF = factory.getExternalDecimalAsLongField(12, false, false, false, false);

	/** <pre>
	        05 PROC-TRAN-TYPE               PIC X(3). </pre> */
	protected static final StringField PROC_TRAN_TYPE = factory.getStringField(3);

	/** <pre>
	        88 PROC-TY-CHEQUE-ACKNOWLEDGED      VALUE 'CHA'. </pre> */
	public static final String PROC_TY_CHEQUE_ACKNOWLEDGED = "CHA";

	/** <pre>
	        88 PROC-TY-CHEQUE-FAILURE           VALUE 'CHF'. </pre> */
	public static final String PROC_TY_CHEQUE_FAILURE = "CHF";

	/** <pre>
	        88 PROC-TY-CHEQUE-PAID-IN           VALUE 'CHI'. </pre> */
	public static final String PROC_TY_CHEQUE_PAID_IN = "CHI";

	/** <pre>
	        88 PROC-TY-CHEQUE-PAID-OUT          VALUE 'CHO'. </pre> */
	public static final String PROC_TY_CHEQUE_PAID_OUT = "CHO";

	/** <pre>
	        88 PROC-TY-CREDIT                   VALUE 'CRE'. </pre> */
	public static final String PROC_TY_CREDIT = "CRE";

	/** <pre>
	        88 PROC-TY-DEBIT                    VALUE 'DEB'. </pre> */
	public static final String PROC_TY_DEBIT = "DEB";

	/** <pre>
	        88 PROC-TY-WEB-CREATE-ACCOUNT       VALUE 'ICA'. </pre> */
	public static final String PROC_TY_WEB_CREATE_ACCOUNT = "ICA";

	/** <pre>
	        88 PROC-TY-WEB-CREATE-CUSTOMER      VALUE 'ICC'. </pre> */
	public static final String PROC_TY_WEB_CREATE_CUSTOMER = "ICC";

	/** <pre>
	        88 PROC-TY-WEB-DELETE-ACCOUNT       VALUE 'IDA'. </pre> */
	public static final String PROC_TY_WEB_DELETE_ACCOUNT = "IDA";

	/** <pre>
	        88 PROC-TY-WEB-DELETE-CUSTOMER      VALUE 'IDC'. </pre> */
	public static final String PROC_TY_WEB_DELETE_CUSTOMER = "IDC";

	/** <pre>
	        88 PROC-TY-BRANCH-CREATE-ACCOUNT    VALUE 'OCA'. </pre> */
	public static final String PROC_TY_BRANCH_CREATE_ACCOUNT = "OCA";

	/** <pre>
	        88 PROC-TY-BRANCH-CREATE-CUSTOMER   VALUE 'OCC'. </pre> */
	public static final String PROC_TY_BRANCH_CREATE_CUSTOMER = "OCC";

	/** <pre>
	        88 PROC-TY-BRANCH-DELETE-ACCOUNT    VALUE 'ODA'. </pre> */
	public static final String PROC_TY_BRANCH_DELETE_ACCOUNT = "ODA";

	/** <pre>
	        88 PROC-TY-BRANCH-DELETE-CUSTOMER   VALUE 'ODC'. </pre> */
	public static final String PROC_TY_BRANCH_DELETE_CUSTOMER = "ODC";

	/** <pre>
	        88 PROC-TY-CREATE-SODD              VALUE 'OCS'. </pre> */
	public static final String PROC_TY_CREATE_SODD = "OCS";

	/** <pre>
	        88 PROC-TY-TRANSFER                 VALUE 'TFR'. </pre> */
	public static final String PROC_TY_TRANSFER = "TFR";

	/** <pre>
	        05 PROC-TRAN-DESC               PIC X(40). </pre> */
	protected static final StringField PROC_TRAN_DESC = factory.getStringField(40);

	/** <pre>
	        05 PROC-TRAN-DESC-XFR REDEFINES PROC-TRAN-DESC. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_DESC.getOffset()); } 
	public static final int PROC_TRAN_DESC_XFR_LEN = 40; 
	public static final int PROC_TRAN_DESC_XFR_OFFSET = factory.getOffset();

	/** <pre>
	          07 PROC-TRAN-DESC-XFR-HEADER PIC X(26). </pre> */
	protected static final StringField PROC_TRAN_DESC_XFR_HEADER = factory.getStringField(26);

	/** <pre>
	          88 PROC-TRAN-DESC-XFR-FLAG
	             VALUE 'TRANSFER'. </pre> */
	public static final String PROC_TRAN_DESC_XFR_FLAG = "TRANSFER";

	/** <pre>
	          07 PROC-TRAN-DESC-XFR-SORTCODE
	             PIC 9(6). </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_DESC_XFR_SORTCODE = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	          07 PROC-TRAN-DESC-XFR-ACCOUNT
	             PIC 9(8). </pre> */
	protected static final ExternalDecimalAsIntField PROC_TRAN_DESC_XFR_ACCOUNT = factory.getExternalDecimalAsIntField(8, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-DESC-DELACC REDEFINES PROC-TRAN-DESC. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_DESC.getOffset()); } 
	public static final int PROC_TRAN_DESC_DELACC_LEN = 40; 
	public static final int PROC_TRAN_DESC_DELACC_OFFSET = factory.getOffset();

	/** <pre>
	          07 PROC-DESC-DELACC-CUSTOMER PIC 9(10). </pre> */
	protected static final ExternalDecimalAsLongField PROC_DESC_DELACC_CUSTOMER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-ACCTYPE PIC X(8). </pre> */
	protected static final StringField PROC_DESC_DELACC_ACCTYPE = factory.getStringField(8);

	/** <pre>
	          07 PROC-DESC-DELACC-LAST-DD PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELACC_LAST_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-LAST-MM PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELACC_LAST_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-LAST-YYYY PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELACC_LAST_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-NEXT-DD PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELACC_NEXT_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-NEXT-MM PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELACC_NEXT_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-NEXT-YYYY PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELACC_NEXT_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELACC-FOOTER PIC X(6). </pre> */
	protected static final StringField PROC_DESC_DELACC_FOOTER = factory.getStringField(6);

	/** <pre>
	          88 PROC-DESC-DELACC-FLAG
	             VALUE 'DELETE'. </pre> */
	public static final String PROC_DESC_DELACC_FLAG = "DELETE";
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-DESC-CREACC REDEFINES PROC-TRAN-DESC. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_DESC.getOffset()); } 
	public static final int PROC_TRAN_DESC_CREACC_LEN = 40; 
	public static final int PROC_TRAN_DESC_CREACC_OFFSET = factory.getOffset();

	/** <pre>
	          07 PROC-DESC-CREACC-CUSTOMER PIC 9(10). </pre> */
	protected static final ExternalDecimalAsLongField PROC_DESC_CREACC_CUSTOMER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-ACCTYPE PIC X(8). </pre> */
	protected static final StringField PROC_DESC_CREACC_ACCTYPE = factory.getStringField(8);

	/** <pre>
	          07 PROC-DESC-CREACC-LAST-DD PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CREACC_LAST_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-LAST-MM PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CREACC_LAST_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-LAST-YYYY PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CREACC_LAST_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-NEXT-DD PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CREACC_NEXT_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-NEXT-MM PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CREACC_NEXT_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-NEXT-YYYY PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CREACC_NEXT_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CREACC-FOOTER PIC X(6). </pre> */
	protected static final StringField PROC_DESC_CREACC_FOOTER = factory.getStringField(6);

	/** <pre>
	          88 PROC-DESC-CREACC-FLAG
	             VALUE 'CREATE'. </pre> */
	public static final String PROC_DESC_CREACC_FLAG = "CREATE";
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-DESC-DELCUS REDEFINES PROC-TRAN-DESC. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_DESC.getOffset()); } 
	public static final int PROC_TRAN_DESC_DELCUS_LEN = 40; 
	public static final int PROC_TRAN_DESC_DELCUS_OFFSET = factory.getOffset();

	/** <pre>
	          07 PROC-DESC-DELCUS-SORTCODE PIC 9(6). </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELCUS_SORTCODE = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELCUS-CUSTOMER PIC 9(10). </pre> */
	protected static final ExternalDecimalAsLongField PROC_DESC_DELCUS_CUSTOMER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELCUS-NAME     PIC X(14). </pre> */
	protected static final StringField PROC_DESC_DELCUS_NAME = factory.getStringField(14);

	/** <pre>
	          07 PROC-DESC-DELCUS-DOB-YYYY  PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELCUS_DOB_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELCUS-FILLER    PIC X. </pre> */
	protected static final StringField PROC_DESC_DELCUS_FILLER = factory.getStringField(1);

	/** <pre>
	          88 PROC-DESC-DELCUS-FILLER-SET VALUE '-'. </pre> */
	public static final String PROC_DESC_DELCUS_FILLER_SET = "-";

	/** <pre>
	          07 PROC-DESC-DELCUS-DOB-MM    PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELCUS_DOB_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-DELCUS-FILLER2   PIC X. </pre> */
	protected static final StringField PROC_DESC_DELCUS_FILLER2 = factory.getStringField(1);

	/** <pre>
	          88 PROC-DESC-DELCUS-FILLER2-SET VALUE '-'. </pre> */
	public static final String PROC_DESC_DELCUS_FILLER2_SET = "-";

	/** <pre>
	          07 PROC-DESC-DELCUS-DOB-DD    PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_DELCUS_DOB_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-DESC-CRECUS REDEFINES PROC-TRAN-DESC. </pre> */
	static { factory.pushOffset(); } 
	static { factory.setOffset(PROC_TRAN_DESC.getOffset()); } 
	public static final int PROC_TRAN_DESC_CRECUS_LEN = 40; 
	public static final int PROC_TRAN_DESC_CRECUS_OFFSET = factory.getOffset();

	/** <pre>
	          07 PROC-DESC-CRECUS-SORTCODE PIC 9(6). </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CRECUS_SORTCODE = factory.getExternalDecimalAsIntField(6, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CRECUS-CUSTOMER PIC 9(10). </pre> */
	protected static final ExternalDecimalAsLongField PROC_DESC_CRECUS_CUSTOMER = factory.getExternalDecimalAsLongField(10, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CRECUS-NAME     PIC X(14). </pre> */
	protected static final StringField PROC_DESC_CRECUS_NAME = factory.getStringField(14);

	/** <pre>
	          07 PROC-DESC-CRECUS-DOB-YYYY  PIC 9999. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CRECUS_DOB_YYYY = factory.getExternalDecimalAsIntField(4, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CRECUS-FILLER    PIC X. </pre> */
	protected static final StringField PROC_DESC_CRECUS_FILLER = factory.getStringField(1);

	/** <pre>
	          88 PROC-DESC-CRECUS-FILLER-SET VALUE '-'. </pre> */
	public static final String PROC_DESC_CRECUS_FILLER_SET = "-";

	/** <pre>
	          07 PROC-DESC-CRECUS-DOB-MM    PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CRECUS_DOB_MM = factory.getExternalDecimalAsIntField(2, false, false, false, false);

	/** <pre>
	          07 PROC-DESC-CRECUS-FILLER2   PIC X. </pre> */
	protected static final StringField PROC_DESC_CRECUS_FILLER2 = factory.getStringField(1);

	/** <pre>
	          88 PROC-DESC-CRECUS-FILLER2-SET VALUE '-'. </pre> */
	public static final String PROC_DESC_CRECUS_FILLER2_SET = "-";

	/** <pre>
	          07 PROC-DESC-CRECUS-DOB-DD    PIC 99. </pre> */
	protected static final ExternalDecimalAsIntField PROC_DESC_CRECUS_DOB_DD = factory.getExternalDecimalAsIntField(2, false, false, false, false);
	static { factory.popOffset(); } 

	/** <pre>
	        05 PROC-TRAN-AMOUNT             PIC S9(10)V99. </pre> */
	protected static final ExternalDecimalAsBigDecimalField PROC_TRAN_AMOUNT = factory.getExternalDecimalAsBigDecimalField(12, 2, true, true, false, false);

	protected byte[] _byteBuffer;
	// Instance variables used to cache field values
	protected Integer procTranSortCode;
	protected Integer procTranNumber;
	protected Long procTranRef;
	protected String procTranType;
	protected BigDecimal procTranAmount;


	public PROCTRAN (byte[] buffer) {
		this._byteBuffer = buffer;
	}

	public PROCTRAN () {
		this._byteBuffer = new byte[COBOL_LANGUAGE_STRUCTURE_LEN];
	}

	public byte[] getByteBuffer() {
		return _byteBuffer;
	}


	public String getProcTranEyeCatcher() {
		return PROC_TRAN_EYE_CATCHER.getString(_byteBuffer);
	}

	public void setProcTranEyeCatcher(String procTranEyeCatcher) {
		PROC_TRAN_EYE_CATCHER.putString(procTranEyeCatcher, _byteBuffer);
	}

	public boolean isProcTranValid() {
		return getProcTranEyeCatcher().equals(PROC_TRAN_VALID);
	}

	public String getProcTranLogicalDeleteFlag() {
		return PROC_TRAN_LOGICAL_DELETE_FLAG.getString(_byteBuffer);
	}

	public void setProcTranLogicalDeleteFlag(String procTranLogicalDeleteFlag) {
		PROC_TRAN_LOGICAL_DELETE_FLAG.putString(procTranLogicalDeleteFlag, _byteBuffer);
	}

	public String getFiller_1() {
		return FILLER_1.getString(_byteBuffer);
	}

	public void setFiller_1(String filler_1) {
		FILLER_1.putString(filler_1, _byteBuffer);
	}

	public int getProcTranSortCode() {
		if (procTranSortCode == null) {
			procTranSortCode = PROC_TRAN_SORT_CODE.getInt(_byteBuffer);
		}
		return procTranSortCode.intValue();
	}

	public void setProcTranSortCode(int procTranSortCode) {
		if (PROC_TRAN_SORT_CODE.equals(this.procTranSortCode, procTranSortCode)) {
			return;
		}
		PROC_TRAN_SORT_CODE.putInt(procTranSortCode, _byteBuffer);
		this.procTranSortCode = procTranSortCode;
	}

	public int getProcTranNumber() {
		if (procTranNumber == null) {
			procTranNumber = PROC_TRAN_NUMBER.getInt(_byteBuffer);
		}
		return procTranNumber.intValue();
	}

	public void setProcTranNumber(int procTranNumber) {
		if (PROC_TRAN_NUMBER.equals(this.procTranNumber, procTranNumber)) {
			return;
		}
		PROC_TRAN_NUMBER.putInt(procTranNumber, _byteBuffer);
		this.procTranNumber = procTranNumber;
	}

	public int getProcTranDate() {
		return PROC_TRAN_DATE.getInt(_byteBuffer);
	}

	public void setProcTranDate(int procTranDate) {
		PROC_TRAN_DATE.putInt(procTranDate, _byteBuffer);
	}

	public int getProcTranDateGrpYyyy() {
		return PROC_TRAN_DATE_GRP_YYYY.getInt(_byteBuffer);
	}

	public void setProcTranDateGrpYyyy(int procTranDateGrpYyyy) {
		PROC_TRAN_DATE_GRP_YYYY.putInt(procTranDateGrpYyyy, _byteBuffer);
	}

	public int getProcTranDateGrpMm() {
		return PROC_TRAN_DATE_GRP_MM.getInt(_byteBuffer);
	}

	public void setProcTranDateGrpMm(int procTranDateGrpMm) {
		PROC_TRAN_DATE_GRP_MM.putInt(procTranDateGrpMm, _byteBuffer);
	}

	public int getProcTranDateGrpDd() {
		return PROC_TRAN_DATE_GRP_DD.getInt(_byteBuffer);
	}

	public void setProcTranDateGrpDd(int procTranDateGrpDd) {
		PROC_TRAN_DATE_GRP_DD.putInt(procTranDateGrpDd, _byteBuffer);
	}

	public int getProcTranTime() {
		return PROC_TRAN_TIME.getInt(_byteBuffer);
	}

	public void setProcTranTime(int procTranTime) {
		PROC_TRAN_TIME.putInt(procTranTime, _byteBuffer);
	}

	public int getProcTranTimeGrpHh() {
		return PROC_TRAN_TIME_GRP_HH.getInt(_byteBuffer);
	}

	public void setProcTranTimeGrpHh(int procTranTimeGrpHh) {
		PROC_TRAN_TIME_GRP_HH.putInt(procTranTimeGrpHh, _byteBuffer);
	}

	public int getProcTranTimeGrpMm() {
		return PROC_TRAN_TIME_GRP_MM.getInt(_byteBuffer);
	}

	public void setProcTranTimeGrpMm(int procTranTimeGrpMm) {
		PROC_TRAN_TIME_GRP_MM.putInt(procTranTimeGrpMm, _byteBuffer);
	}

	public int getProcTranTimeGrpSs() {
		return PROC_TRAN_TIME_GRP_SS.getInt(_byteBuffer);
	}

	public void setProcTranTimeGrpSs(int procTranTimeGrpSs) {
		PROC_TRAN_TIME_GRP_SS.putInt(procTranTimeGrpSs, _byteBuffer);
	}

	public long getProcTranRef() {
		if (procTranRef == null) {
			procTranRef = PROC_TRAN_REF.getLong(_byteBuffer);
		}
		return procTranRef.longValue();
	}

	public void setProcTranRef(long procTranRef) {
		if (PROC_TRAN_REF.equals(this.procTranRef, procTranRef)) {
			return;
		}
		PROC_TRAN_REF.putLong(procTranRef, _byteBuffer);
		this.procTranRef = procTranRef;
	}

	public String getProcTranType() {
		if (procTranType == null) {
			procTranType = PROC_TRAN_TYPE.getString(_byteBuffer);
		}
		return procTranType;
	}

	public void setProcTranType(String procTranType) {
		if (PROC_TRAN_TYPE.equals(this.procTranType, procTranType)) {
			return;
		}
		PROC_TRAN_TYPE.putString(procTranType, _byteBuffer);
		this.procTranType = procTranType;
	}

	public boolean isProcTyChequeAcknowledged() {
		return getProcTranType().equals(PROC_TY_CHEQUE_ACKNOWLEDGED);
	}

	public boolean isProcTyChequeFailure() {
		return getProcTranType().equals(PROC_TY_CHEQUE_FAILURE);
	}

	public boolean isProcTyChequePaidIn() {
		return getProcTranType().equals(PROC_TY_CHEQUE_PAID_IN);
	}

	public boolean isProcTyChequePaidOut() {
		return getProcTranType().equals(PROC_TY_CHEQUE_PAID_OUT);
	}

	public boolean isProcTyCredit() {
		return getProcTranType().equals(PROC_TY_CREDIT);
	}

	public boolean isProcTyDebit() {
		return getProcTranType().equals(PROC_TY_DEBIT);
	}

	public boolean isProcTyWebCreateAccount() {
		return getProcTranType().equals(PROC_TY_WEB_CREATE_ACCOUNT);
	}

	public boolean isProcTyWebCreateCustomer() {
		return getProcTranType().equals(PROC_TY_WEB_CREATE_CUSTOMER);
	}

	public boolean isProcTyWebDeleteAccount() {
		return getProcTranType().equals(PROC_TY_WEB_DELETE_ACCOUNT);
	}

	public boolean isProcTyWebDeleteCustomer() {
		return getProcTranType().equals(PROC_TY_WEB_DELETE_CUSTOMER);
	}

	public boolean isProcTyBranchCreateAccount() {
		return getProcTranType().equals(PROC_TY_BRANCH_CREATE_ACCOUNT);
	}

	public boolean isProcTyBranchCreateCustomer() {
		return getProcTranType().equals(PROC_TY_BRANCH_CREATE_CUSTOMER);
	}

	public boolean isProcTyBranchDeleteAccount() {
		return getProcTranType().equals(PROC_TY_BRANCH_DELETE_ACCOUNT);
	}

	public boolean isProcTyBranchDeleteCustomer() {
		return getProcTranType().equals(PROC_TY_BRANCH_DELETE_CUSTOMER);
	}

	public boolean isProcTyCreateSodd() {
		return getProcTranType().equals(PROC_TY_CREATE_SODD);
	}

	public boolean isProcTyTransfer() {
		return getProcTranType().equals(PROC_TY_TRANSFER);
	}

	public String getProcTranDesc() {
		return PROC_TRAN_DESC.getString(_byteBuffer);
	}

	public void setProcTranDesc(String procTranDesc) {
		PROC_TRAN_DESC.putString(procTranDesc, _byteBuffer);
	}

	public String getProcTranDescXfrHeader() {
		return PROC_TRAN_DESC_XFR_HEADER.getString(_byteBuffer);
	}

	public void setProcTranDescXfrHeader(String procTranDescXfrHeader) {
		PROC_TRAN_DESC_XFR_HEADER.putString(procTranDescXfrHeader, _byteBuffer);
	}

	public boolean isProcTranDescXfrFlag() {
		return getProcTranDescXfrHeader().equals(PROC_TRAN_DESC_XFR_FLAG);
	}

	public int getProcTranDescXfrSortcode() {
		return PROC_TRAN_DESC_XFR_SORTCODE.getInt(_byteBuffer);
	}

	public void setProcTranDescXfrSortcode(int procTranDescXfrSortcode) {
		PROC_TRAN_DESC_XFR_SORTCODE.putInt(procTranDescXfrSortcode, _byteBuffer);
	}

	public int getProcTranDescXfrAccount() {
		return PROC_TRAN_DESC_XFR_ACCOUNT.getInt(_byteBuffer);
	}

	public void setProcTranDescXfrAccount(int procTranDescXfrAccount) {
		PROC_TRAN_DESC_XFR_ACCOUNT.putInt(procTranDescXfrAccount, _byteBuffer);
	}

	public long getProcDescDelaccCustomer() {
		return PROC_DESC_DELACC_CUSTOMER.getLong(_byteBuffer);
	}

	public void setProcDescDelaccCustomer(long procDescDelaccCustomer) {
		PROC_DESC_DELACC_CUSTOMER.putLong(procDescDelaccCustomer, _byteBuffer);
	}

	public String getProcDescDelaccAcctype() {
		return PROC_DESC_DELACC_ACCTYPE.getString(_byteBuffer);
	}

	public void setProcDescDelaccAcctype(String procDescDelaccAcctype) {
		PROC_DESC_DELACC_ACCTYPE.putString(procDescDelaccAcctype, _byteBuffer);
	}

	public int getProcDescDelaccLastDd() {
		return PROC_DESC_DELACC_LAST_DD.getInt(_byteBuffer);
	}

	public void setProcDescDelaccLastDd(int procDescDelaccLastDd) {
		PROC_DESC_DELACC_LAST_DD.putInt(procDescDelaccLastDd, _byteBuffer);
	}

	public int getProcDescDelaccLastMm() {
		return PROC_DESC_DELACC_LAST_MM.getInt(_byteBuffer);
	}

	public void setProcDescDelaccLastMm(int procDescDelaccLastMm) {
		PROC_DESC_DELACC_LAST_MM.putInt(procDescDelaccLastMm, _byteBuffer);
	}

	public int getProcDescDelaccLastYyyy() {
		return PROC_DESC_DELACC_LAST_YYYY.getInt(_byteBuffer);
	}

	public void setProcDescDelaccLastYyyy(int procDescDelaccLastYyyy) {
		PROC_DESC_DELACC_LAST_YYYY.putInt(procDescDelaccLastYyyy, _byteBuffer);
	}

	public int getProcDescDelaccNextDd() {
		return PROC_DESC_DELACC_NEXT_DD.getInt(_byteBuffer);
	}

	public void setProcDescDelaccNextDd(int procDescDelaccNextDd) {
		PROC_DESC_DELACC_NEXT_DD.putInt(procDescDelaccNextDd, _byteBuffer);
	}

	public int getProcDescDelaccNextMm() {
		return PROC_DESC_DELACC_NEXT_MM.getInt(_byteBuffer);
	}

	public void setProcDescDelaccNextMm(int procDescDelaccNextMm) {
		PROC_DESC_DELACC_NEXT_MM.putInt(procDescDelaccNextMm, _byteBuffer);
	}

	public int getProcDescDelaccNextYyyy() {
		return PROC_DESC_DELACC_NEXT_YYYY.getInt(_byteBuffer);
	}

	public void setProcDescDelaccNextYyyy(int procDescDelaccNextYyyy) {
		PROC_DESC_DELACC_NEXT_YYYY.putInt(procDescDelaccNextYyyy, _byteBuffer);
	}

	public String getProcDescDelaccFooter() {
		return PROC_DESC_DELACC_FOOTER.getString(_byteBuffer);
	}

	public void setProcDescDelaccFooter(String procDescDelaccFooter) {
		PROC_DESC_DELACC_FOOTER.putString(procDescDelaccFooter, _byteBuffer);
	}

	public boolean isProcDescDelaccFlag() {
		return getProcDescDelaccFooter().equals(PROC_DESC_DELACC_FLAG);
	}

	public long getProcDescCreaccCustomer() {
		return PROC_DESC_CREACC_CUSTOMER.getLong(_byteBuffer);
	}

	public void setProcDescCreaccCustomer(long procDescCreaccCustomer) {
		PROC_DESC_CREACC_CUSTOMER.putLong(procDescCreaccCustomer, _byteBuffer);
	}

	public String getProcDescCreaccAcctype() {
		return PROC_DESC_CREACC_ACCTYPE.getString(_byteBuffer);
	}

	public void setProcDescCreaccAcctype(String procDescCreaccAcctype) {
		PROC_DESC_CREACC_ACCTYPE.putString(procDescCreaccAcctype, _byteBuffer);
	}

	public int getProcDescCreaccLastDd() {
		return PROC_DESC_CREACC_LAST_DD.getInt(_byteBuffer);
	}

	public void setProcDescCreaccLastDd(int procDescCreaccLastDd) {
		PROC_DESC_CREACC_LAST_DD.putInt(procDescCreaccLastDd, _byteBuffer);
	}

	public int getProcDescCreaccLastMm() {
		return PROC_DESC_CREACC_LAST_MM.getInt(_byteBuffer);
	}

	public void setProcDescCreaccLastMm(int procDescCreaccLastMm) {
		PROC_DESC_CREACC_LAST_MM.putInt(procDescCreaccLastMm, _byteBuffer);
	}

	public int getProcDescCreaccLastYyyy() {
		return PROC_DESC_CREACC_LAST_YYYY.getInt(_byteBuffer);
	}

	public void setProcDescCreaccLastYyyy(int procDescCreaccLastYyyy) {
		PROC_DESC_CREACC_LAST_YYYY.putInt(procDescCreaccLastYyyy, _byteBuffer);
	}

	public int getProcDescCreaccNextDd() {
		return PROC_DESC_CREACC_NEXT_DD.getInt(_byteBuffer);
	}

	public void setProcDescCreaccNextDd(int procDescCreaccNextDd) {
		PROC_DESC_CREACC_NEXT_DD.putInt(procDescCreaccNextDd, _byteBuffer);
	}

	public int getProcDescCreaccNextMm() {
		return PROC_DESC_CREACC_NEXT_MM.getInt(_byteBuffer);
	}

	public void setProcDescCreaccNextMm(int procDescCreaccNextMm) {
		PROC_DESC_CREACC_NEXT_MM.putInt(procDescCreaccNextMm, _byteBuffer);
	}

	public int getProcDescCreaccNextYyyy() {
		return PROC_DESC_CREACC_NEXT_YYYY.getInt(_byteBuffer);
	}

	public void setProcDescCreaccNextYyyy(int procDescCreaccNextYyyy) {
		PROC_DESC_CREACC_NEXT_YYYY.putInt(procDescCreaccNextYyyy, _byteBuffer);
	}

	public String getProcDescCreaccFooter() {
		return PROC_DESC_CREACC_FOOTER.getString(_byteBuffer);
	}

	public void setProcDescCreaccFooter(String procDescCreaccFooter) {
		PROC_DESC_CREACC_FOOTER.putString(procDescCreaccFooter, _byteBuffer);
	}

	public boolean isProcDescCreaccFlag() {
		return getProcDescCreaccFooter().equals(PROC_DESC_CREACC_FLAG);
	}

	public int getProcDescDelcusSortcode() {
		return PROC_DESC_DELCUS_SORTCODE.getInt(_byteBuffer);
	}

	public void setProcDescDelcusSortcode(int procDescDelcusSortcode) {
		PROC_DESC_DELCUS_SORTCODE.putInt(procDescDelcusSortcode, _byteBuffer);
	}

	public long getProcDescDelcusCustomer() {
		return PROC_DESC_DELCUS_CUSTOMER.getLong(_byteBuffer);
	}

	public void setProcDescDelcusCustomer(long procDescDelcusCustomer) {
		PROC_DESC_DELCUS_CUSTOMER.putLong(procDescDelcusCustomer, _byteBuffer);
	}

	public String getProcDescDelcusName() {
		return PROC_DESC_DELCUS_NAME.getString(_byteBuffer);
	}

	public void setProcDescDelcusName(String procDescDelcusName) {
		PROC_DESC_DELCUS_NAME.putString(procDescDelcusName, _byteBuffer);
	}

	public int getProcDescDelcusDobYyyy() {
		return PROC_DESC_DELCUS_DOB_YYYY.getInt(_byteBuffer);
	}

	public void setProcDescDelcusDobYyyy(int procDescDelcusDobYyyy) {
		PROC_DESC_DELCUS_DOB_YYYY.putInt(procDescDelcusDobYyyy, _byteBuffer);
	}

	public String getProcDescDelcusFiller() {
		return PROC_DESC_DELCUS_FILLER.getString(_byteBuffer);
	}

	public void setProcDescDelcusFiller(String procDescDelcusFiller) {
		PROC_DESC_DELCUS_FILLER.putString(procDescDelcusFiller, _byteBuffer);
	}

	public boolean isProcDescDelcusFillerSet() {
		return getProcDescDelcusFiller().equals(PROC_DESC_DELCUS_FILLER_SET);
	}

	public int getProcDescDelcusDobMm() {
		return PROC_DESC_DELCUS_DOB_MM.getInt(_byteBuffer);
	}

	public void setProcDescDelcusDobMm(int procDescDelcusDobMm) {
		PROC_DESC_DELCUS_DOB_MM.putInt(procDescDelcusDobMm, _byteBuffer);
	}

	public String getProcDescDelcusFiller2() {
		return PROC_DESC_DELCUS_FILLER2.getString(_byteBuffer);
	}

	public void setProcDescDelcusFiller2(String procDescDelcusFiller2) {
		PROC_DESC_DELCUS_FILLER2.putString(procDescDelcusFiller2, _byteBuffer);
	}

	public boolean isProcDescDelcusFiller2Set() {
		return getProcDescDelcusFiller2().equals(PROC_DESC_DELCUS_FILLER2_SET);
	}

	public int getProcDescDelcusDobDd() {
		return PROC_DESC_DELCUS_DOB_DD.getInt(_byteBuffer);
	}

	public void setProcDescDelcusDobDd(int procDescDelcusDobDd) {
		PROC_DESC_DELCUS_DOB_DD.putInt(procDescDelcusDobDd, _byteBuffer);
	}

	public int getProcDescCrecusSortcode() {
		return PROC_DESC_CRECUS_SORTCODE.getInt(_byteBuffer);
	}

	public void setProcDescCrecusSortcode(int procDescCrecusSortcode) {
		PROC_DESC_CRECUS_SORTCODE.putInt(procDescCrecusSortcode, _byteBuffer);
	}

	public long getProcDescCrecusCustomer() {
		return PROC_DESC_CRECUS_CUSTOMER.getLong(_byteBuffer);
	}

	public void setProcDescCrecusCustomer(long procDescCrecusCustomer) {
		PROC_DESC_CRECUS_CUSTOMER.putLong(procDescCrecusCustomer, _byteBuffer);
	}

	public String getProcDescCrecusName() {
		return PROC_DESC_CRECUS_NAME.getString(_byteBuffer);
	}

	public void setProcDescCrecusName(String procDescCrecusName) {
		PROC_DESC_CRECUS_NAME.putString(procDescCrecusName, _byteBuffer);
	}

	public int getProcDescCrecusDobYyyy() {
		return PROC_DESC_CRECUS_DOB_YYYY.getInt(_byteBuffer);
	}

	public void setProcDescCrecusDobYyyy(int procDescCrecusDobYyyy) {
		PROC_DESC_CRECUS_DOB_YYYY.putInt(procDescCrecusDobYyyy, _byteBuffer);
	}

	public String getProcDescCrecusFiller() {
		return PROC_DESC_CRECUS_FILLER.getString(_byteBuffer);
	}

	public void setProcDescCrecusFiller(String procDescCrecusFiller) {
		PROC_DESC_CRECUS_FILLER.putString(procDescCrecusFiller, _byteBuffer);
	}

	public boolean isProcDescCrecusFillerSet() {
		return getProcDescCrecusFiller().equals(PROC_DESC_CRECUS_FILLER_SET);
	}

	public int getProcDescCrecusDobMm() {
		return PROC_DESC_CRECUS_DOB_MM.getInt(_byteBuffer);
	}

	public void setProcDescCrecusDobMm(int procDescCrecusDobMm) {
		PROC_DESC_CRECUS_DOB_MM.putInt(procDescCrecusDobMm, _byteBuffer);
	}

	public String getProcDescCrecusFiller2() {
		return PROC_DESC_CRECUS_FILLER2.getString(_byteBuffer);
	}

	public void setProcDescCrecusFiller2(String procDescCrecusFiller2) {
		PROC_DESC_CRECUS_FILLER2.putString(procDescCrecusFiller2, _byteBuffer);
	}

	public boolean isProcDescCrecusFiller2Set() {
		return getProcDescCrecusFiller2().equals(PROC_DESC_CRECUS_FILLER2_SET);
	}

	public int getProcDescCrecusDobDd() {
		return PROC_DESC_CRECUS_DOB_DD.getInt(_byteBuffer);
	}

	public void setProcDescCrecusDobDd(int procDescCrecusDobDd) {
		PROC_DESC_CRECUS_DOB_DD.putInt(procDescCrecusDobDd, _byteBuffer);
	}

	public BigDecimal getProcTranAmount() {
		if (procTranAmount == null) {
			procTranAmount = PROC_TRAN_AMOUNT.getBigDecimal(_byteBuffer);
		}
		return procTranAmount;
	}

	public void setProcTranAmount(BigDecimal procTranAmount) {
		if (PROC_TRAN_AMOUNT.equals(this.procTranAmount, procTranAmount)) {
			return;
		}
		PROC_TRAN_AMOUNT.putBigDecimal(procTranAmount, _byteBuffer);
		this.procTranAmount = procTranAmount;
	}

}
