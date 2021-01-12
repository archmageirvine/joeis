package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038211 Can express a(n) with the digits of a(n)^4 in order, only adding plus signs.
 * @author Sean A. Irvine
 */
public class A038211 extends A038206 {

  private static final long[] WHEEL = {2, 1, 3, 3};
  private int mW = -1;
  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      if (++mW == WHEEL.length) {
        mW = 0;
      }
      mN += WHEEL[mW];
      final Z n = Z.valueOf(mN);
      if (is(n, n.pow(4).toString(), Z.ZERO)) {
        return n;
      }
    }
  }
}
