package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A083207 Zumkeller or integer-perfect numbers: numbers n whose divisors can be partitioned into two disjoint sets with equal sum.
 * @author Sean A. Irvine
 */
public class A083207 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long[] d, final long s2, final int k, final long s) {
    if (s >= s2) {
      return s == s2;
    }
    for (int j = k; j < d.length; ++j) {
      if (is(d, s2, j + 1, s + d[j])) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final long r = n % 18;
    if (r == 6 || r == 12) {
      return true;
    }
    final long s = Functions.SIGMA1.l(n);
    if ((s & 1) == 1) {
      return false;
    }
    final long[] d = ZUtils.toLong(Jaguar.factor(n).divisorsSorted());
    if (d[d.length - 1] > s / 2) {
      return false;
    }
    return is(d, s / 2, 1, 1);
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
