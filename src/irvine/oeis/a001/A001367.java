package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001367 Solution to f(2) <code>= 1,</code> f(n) <code>= sqrt(n)</code> f(sqrt(n)) <code>+ n</code> at values <code>n =</code> 2^2^i.
 * @author Sean A. Irvine
 */
public class A001367 implements Sequence {

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
