package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253725 Integer squares c^2 that are equal to the sums of a number M(n) of consecutive cubed integers b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2, starting at b(n) (A002593) for M(n) being twice a squared integer (A001105).
 * @author Sean A. Irvine
 */
public class A253725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253725() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {254016, 76055841, 4286582784L, 97578140625L, 1253342942784L, 10849309481241L, 70360154505216L, 366000785535609L, 1599920001000000L, 6075789839706609L, 20542200096854016L, 62996919308080641L, 177789795179217984L, 467082203214515625L, 1152912708530601984L});
  }
}
