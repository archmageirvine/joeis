package irvine.oeis.a071;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071300 Numerator of b(n) where b(n+1) = Sum_{k=0..n} b'((n^2-k^2)/n), b(0) = b(1) = 1, and b'(x) = b(x) if x is an integer and is linearly interpolated otherwise.
 * @author Sean A. Irvine
 */
public class A071300 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunction1<Q> mB = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      if (n <= 1) {
        return Q.ONE;
      }
      Q sum = Q.ZERO;
      final int m = n - 1;
      for (int k = 0; k < n; ++k) {
        final int j = (m * m - k * k) / m;
        final Q lo = get(j);
        if ((m * m - k * k) % m == 0) {
          sum = sum.add(lo);
        } else {
          sum = sum.add(lo.add(get(j + 1).subtract(lo).multiply(new Q((long) m * m - (long) k * k - (long) j * m, m))));
        }
      }
      return sum;
    }
  };

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(mB.get(++mN));
  }
}
