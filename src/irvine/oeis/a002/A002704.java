package irvine.oeis.a002;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction3;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002704.
 * @author Sean A. Irvine
 */
public class A002704 extends MemoryFunction3<Integer, Z> implements Sequence {

  // After R. J. Mathar

  @Override
  protected Z compute(final Integer r, final Integer s, final Integer k) {
    if (r <= 0) {
      return r < 0 ? Z.ZERO : Z.ONE;
    }
    if (s < 0) {
      return Z.ZERO;
    }
    if (IntegerUtils.gcd(s, 2 * k + 1) > 1) {
      return get(r, s - 1, k);
    } else {
      return get(r, s - 1, k).add(get(r - s, s - 1, k));
    }
  }

  protected Z q(final int n, final int k) {
    Z q = Z.ZERO;
    final long nn = n;
    final long kk = k;
    final Q knrat = new Q(2L * kk * nn * nn + nn * nn + kk * kk, 4L * kk);
    if (knrat.isInteger()) {
      final int limit = knrat.toZ().intValueExact();
      for (int alpha = 0; alpha < limit; ++alpha) {
        final int m = 2 * n + n / k;
        if ((2 * alpha) % m == limit % m) {
          q = q.add(get(alpha, n + (n - k) / (2 * k), k));
        }
      }
    }
    return q;
  }

  private int mN = -3;

  @Override
  public Z next() {
    mN += 6;
    return q(mN, 3);
  }
}
