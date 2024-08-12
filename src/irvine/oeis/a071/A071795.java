package irvine.oeis.a071;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071795 Numerators of a(n+1) = Sum_{k=1..n} a'(n/k), a(1)=1, where a'(x)=a(x) if x integer and is linearly interpolated otherwise.
 * @author Sean A. Irvine
 */
public class A071795 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Q> mB = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      if (n == 1) {
        return Q.ONE;
      }
      Q sum = Q.ZERO;
      final int m = n - 1;
      for (int k = 1; k < n; ++k) {
        final int j = m / k;
        final Q lo = get(j);
        if (m % k == 0) {
          sum = sum.add(lo);
        } else {
          sum = sum.add(lo.add(get(j + 1).subtract(lo).multiply(new Q(m - (long) j * k, k))));
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
