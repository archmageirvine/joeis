package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038209 Can express a(n) with the digits of a(n)^3 in order, only adding plus signs.
 * @author Sean A. Irvine
 */
public class A038209 extends A038206 {

  private static final long[] WHEEL = {1, 1, 7};
  private int mW = -1;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mW == WHEEL.length) {
        mW = 0;
      }
      mN += WHEEL[mW];
      final Z n = Z.valueOf(mN);
      if (is(n, n.pow(3).toString(), Z.ZERO)) {
        return n;
      }
    }
  }
}
