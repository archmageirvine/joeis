package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A081512 a(n) = smallest number which can be expressed as the sum of n of its distinct divisors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A081512 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long[] d, final long m, final long s, final int pos, final long remaining) {
    if (remaining == 0) {
      return s == m;
    }
    for (int k = pos; k < d.length; ++k) {
      final long t = s + d[k];
      if (t <= m && is(d, m, t, k + 1, remaining - 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long m, final long n) {
    final Z[] d = Jaguar.factor(m).divisors();
    if (d.length < n) {
      return false;
    }
    return is(ZUtils.toLong(d), m, 0, 0, n);
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(2 - mN);
    }
    long k = 5;
    while (true) {
      if (is(++k, mN)) {
        return Z.valueOf(k);
      }
    }
  }
}
