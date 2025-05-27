package irvine.oeis.a188;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A188775 Numbers k such that Sum_{j=1..k} j^j == -1 (mod k).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A188775 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long sum = 0;
    for (long k = 1; k <= n; ++k) {
      sum += LongUtils.modPow(k, k, n);
      sum %= n;
    }
    return sum == n - 1;
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
