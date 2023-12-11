package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A006196 Number of leftist trees with n leaves.
 * @author Sean A. Irvine
 */
public class A006196 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j < m; ++j) {
      Z t = Z.ZERO;
      for (long k = 0; k <= (n + j) / 2 - m; ++k) {
        t = t.add(get(n - k - m, k + m - j).multiply(get(k + m - j, m - j)));
      }
      sum = sum.add(t.multiply(Binomial.binomial(m, j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : get(mN, 1L);
  }
}
