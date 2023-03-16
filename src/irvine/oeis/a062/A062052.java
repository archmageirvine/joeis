package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062052 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long n) {
    Z m = Z.valueOf(n);
    long cnt = 0;
    while (true) {
      m = m.makeOdd();
      if (++cnt > 2) {
        return false;
      }
      if (Z.ONE.equals(m)) {
        break;
      }
      m = m.multiply(3).add(1);
    }
    return cnt == 2;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

