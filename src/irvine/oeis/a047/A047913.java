package irvine.oeis.a047;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047913 Triangle of numbers a(n,k) = number of partitions of k such that k = n + n_1 + n_2 + ... + n_t where n_1 &lt;= 2n and n_{i+1} &lt;= 2n_i for all i.
 * @author Sean A. Irvine
 */
public class A047913 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (n < 1 || m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * n; ++k) {
      sum = sum.add(get(k, m - n));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    return get(mM, mN);
  }
}
