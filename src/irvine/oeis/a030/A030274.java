package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030274 Numerators of sequence {b(1), b(2), ...} which when COMPOSED with itself gives {1,2,3,...}.
 * @author Sean A. Irvine
 */
public class A030274 extends MemoryFunction2<Long, Q> implements Sequence {

  private long mN = 0;

  @Override
  protected Q compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    if (n <= m) {
      return Q.ZERO;
    }
    Q sum = Q.ZERO;
    for (long i = m + 1; i < n; ++i) {
      sum = sum.add(get(n, i).multiply(get(i, m)));
    }
    return sum.subtract(Binomial.binomial(n + m - 1, 2 * m - 1)).divide(2).negate();
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(get(++mN, 1L));
  }
}
