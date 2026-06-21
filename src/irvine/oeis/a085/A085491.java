package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A085491 Number of ways to write n as sum of distinct divisors of n+1.
 * @author Sean A. Irvine
 */
public class A085491 extends Sequence0 {

  private long mN = -1;
  private long mCount = 0;

  private void search(final long[] d, final long sum, final int pos) {
    if (sum == mN) {
      ++mCount;
      return;
    }
    for (int k = pos; k < d.length; ++k) {
      final long s = sum + d[k];
      if (s <= mN) {
        search(d, s, k + 1);
      }
    }
  }

  @Override
  public Z next() {
    final long[] d = ZUtils.toLong(Jaguar.factor(++mN + 1).divisors());
    mCount = 0;
    search(d, 0, 0);
    return Z.valueOf(mCount);
  }
}
