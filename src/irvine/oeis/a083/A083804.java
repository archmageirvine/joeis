package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083804 a(1) = 1. If the (n-1)th partial concatenation is divisible by n then a(n) = 0. Otherwise, a(n) is the smallest positive number such that the n-th partial concatenation is divisible by n.
 * @author Sean A. Irvine
 */
public class A083804 extends Sequence1 {

  protected long mN = 0;
  protected Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long r = mA.mod(mN);
      mA = mA.multiply(10);
      if (r == 0) {
        return Z.ZERO;
      }
      long k = 0;
      long lim = 10;
      while (true) {
        if (++k == lim) {
          lim *= 10;
          mA = mA.multiply(10);
        }
        final Z t = mA.add(k);
        if (t.mod(mN) == 0) {
          mA = t;
          return Z.valueOf(k);
        }
      }
    }
    return mA;
  }
}
