package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005651 Sum of multinomial coefficients (n_1+n_2+...)!/(n_1!*n_2!*...) where (n_1, n_2, ...) runs over all integer partitions of n.
 * @author Sean A. Irvine
 */
public class A005651 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= m) {
      return n.equals(m) ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ONE;
    for (long k = m; k <= n / 2; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(get(n - k, k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : get(mN, 1L);
  }
}
