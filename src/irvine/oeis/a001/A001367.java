package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001367 Solution to f(2) = 1, f(n) = sqrt(n) f(sqrt(n)) + n at values n = 2^2^i.
 * @author Sean A. Irvine
 */
public class A001367 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mN > 31) {
        throw new UnsupportedOperationException();
      }
      final int s = 1 << mN;
      final int r = s >>> 1;
      final Z n = Z.ONE.shiftLeft(s);
      mA = mA.shiftLeft(r).add(n);
    }
    return mA;
  }
}
