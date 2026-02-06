package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A392437 3-composable numbers: numbers k divisible by 3 but not by 2, for which k/3 is a sum of nontrivial divisors of k.
 * @author Sean A. Irvine
 */
public class A392437 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long k, final long[] d, final int pos, final long sum) {
    for (int j = pos; j < d.length; ++j) {
      if (d[j] == k) {
        continue;
      }
      final long s = sum + d[j];
      if (s == k || (s < k && is(k, d, j + 1, s))) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final long k = n / 3;
    final long[] d = ZUtils.toLong(Jaguar.factor(n).divisors());
    return is(k, d, 1, 0);
  }

  @Override
  public Z next() {
    while (true) {
      mN += 6;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

