package irvine.oeis.a128;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A094396.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A128981 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long s = 0;
    for (long k = 1; k <= n; ++k) {
      s += LongUtils.modPow(k, k, n);
      s %= n;
    }
    return s == 0;
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
