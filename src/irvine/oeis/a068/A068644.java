package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A054263 Number of palindromic triangular numbers with n digits.
 * @author Sean A. Irvine
 */
public class A068644 extends A000217 {

  private Z mLim = Z.ONE;
  {
    super.next(); // skip 0
  }
  private Z mA = super.next();
  private long mM = 1;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long t = mM;
    while (mA.compareTo(mLim) < 0) {
      t = mM;
      do {
        mA = super.next();
        ++mM;
      } while (!ZUtils.isPalindrome(mA, 10));
    }
    return t == mM ? Z.ZERO : Z.valueOf(t);
  }
}
