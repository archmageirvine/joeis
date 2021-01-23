package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a029.A029827;

/**
 * A036381 Number of connected numbers (A029827) in the interval [2^(n-1)+1, 2^n].
 * @author Sean A. Irvine
 */
public class A036381 extends A029827 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    long c = 0;
    while (mA.compareTo(mLim) <= 0) {
      mA = super.next();
      ++c;
    }
    return Z.valueOf(c);
  }
}
