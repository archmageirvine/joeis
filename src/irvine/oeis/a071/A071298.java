package irvine.oeis.a071;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071298 Numerators of a(n+1) = Sum_{k=0..n} a'(k^2/n), where a(0) = a(1) = 1; and a'(x) = a(x) if x is an integer and is linearly interpolated otherwise.
 * @author Sean A. Irvine
 */
public class A071298 extends Sequence0 {

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
        final int j = k * k / m;
        final Q lo = get(j);
        if ((k * k) % m == 0) {
          sum = sum.add(lo);
        } else {
          sum = sum.add(lo.add(get(j + 1).subtract(lo).multiply(new Q((long) k * k - (long) j * m, m))));
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
