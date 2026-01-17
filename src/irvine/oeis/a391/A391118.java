package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A391118 Let B_n = {b_1 &lt; b_2 &lt; ...} be the set of those integers in [n, n^2] which have a divisor in (n, 2n). a(n) = max(b_(i+1) - b_i).
 * @author Sean A. Irvine
 */
public class A391118 extends Sequence3 {

  private long mN = 2;

  private boolean is(final long k, final long n) {
    for (final Z dd : Jaguar.factor(k).divisors()) {
      final long d = dd.longValue();
      if (d > n && d < 2 * n) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long prev = 0;
    long max = 0;
    for (long k = mN; k <= mN * mN; ++k) {
      if (is(k, mN)) {
        if (prev != 0 && k - prev > max) {
          max = k - prev;
        }
        prev = k;
      }
    }
    return Z.valueOf(max);
  }
}
