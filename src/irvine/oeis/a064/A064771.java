package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064771 Let S(n) = set of divisors of n, excluding n; sequence gives n such that there is a unique subset of S(n) that sums to n.
 * @author Sean A. Irvine
 */
public class A064771 extends Sequence1 {

  private long mN = 5;
  private long mCount = 0;

  private void search(final long n, final long[] d, final long sum, final int k) {
    if (sum >= n) {
      if (sum == n) {
        ++mCount;
      }
      return;
    }
    if (mCount > 1 || k >= d.length) {
      return;
    }
    if (d[k] != n) {
      search(n, d, sum + d[k], k + 1);
    }
    search(n, d, sum, k + 1);
  }

  private boolean is(final long n) {
    final long[] d = ZUtils.toLong(Jaguar.factor(n).divisors());
    mCount = 0;
    search(n, d, 0, 0);
    return mCount == 1;
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
