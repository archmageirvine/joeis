package irvine.oeis.a341;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A341436 Numbers k such that k divides Sum_{j=1..k} j^(k+1-j).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A341436 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long s = 0;
    for (long k = 1; k <= n; ++k) {
      s += LongUtils.modPow(k, n + 1 - k, n);
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
