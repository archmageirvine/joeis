package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A083209 Numbers whose divisors can be partitioned in exactly one way into two disjoint sets with the same sum.
 * @author Sean A. Irvine
 */
public class A083209 extends Sequence1 {

  private long mN = 0;

  private int is(final long[] d, final long s2, final int k, final long s) {
    if (s >= s2) {
      return s == s2 ? 1 : 0;
    }
    int cnt = 0;
    for (int j = k; j < d.length; ++j) {
      cnt += is(d, s2, j + 1, s + d[j]);
      if (cnt > 1) {
        return cnt;
      }
    }
    return cnt;
  }

  private boolean is(final long n) {
    final long s = Functions.SIGMA1.l(n);
    if ((s & 1) == 1) {
      return false;
    }
    final long[] d = ZUtils.toLong(Jaguar.factor(n).divisorsSorted());
    if (d[d.length - 1] > s / 2) {
      return false;
    }
    return is(d, s / 2, 1, 1) == 1;
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
