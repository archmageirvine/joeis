package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a003.A003098;

/**
 * A054263 Number of palindromic triangular numbers with n digits.
 * @author Sean A. Irvine
 */
public class A054263 extends A003098 {

  private Z mLim = Z.ONE;
  {
    super.next(); // skip 0
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long cnt = 0;
    while (mA.compareTo(mLim) < 0) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}
