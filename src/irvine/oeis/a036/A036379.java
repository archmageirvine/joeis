package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a029.A029827;

/**
 * A036379 Special connected numbers: minimal and maximal connected numbers (cf. A029827) of a given binary order, i.e., between two consecutive powers of 2.
 * @author Sean A. Irvine
 */
public class A036379 extends A029827 {

  private boolean mReportLo = true;
  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    if (mReportLo) {
      // Return previously discovered low point
      mReportLo = false;
      return mA;
    }
    while (mLim.compareTo(mA) <= 0) {
      mLim = mLim.multiply2();
    }
    // Find largest value in interval
    Z hi;
    do {
      hi = mA;
      mA = super.next();
    } while (mA.compareTo(mLim) <= 0);
    mReportLo = true;
    return hi;
  }
}
