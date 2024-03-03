package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a003.A003098;

/**
 * A054263 Number of palindromic triangular numbers with n digits.
 * @author Sean A. Irvine
 */
public class A068641 extends A003098 {

  private Z mLim = Z.ONE;
  {
    super.next(); // skip 0
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    while (mA.compareTo(mLim) < 0) {
      mA = super.next();
    }
    mLim = mLim.multiply(10);
    return mA.compareTo(mLim) >= 0 ? Z.ZERO : mA;
  }
}
