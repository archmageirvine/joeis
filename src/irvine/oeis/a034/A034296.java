package irvine.oeis.a034;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A034296 Number of flat partitions of n: partitions {a_i} with each |a_i - a_{i-1}| &lt;= 1.
 * @author Sean A. Irvine
 */
public class A034296 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long j = 1; j <= n / m; ++j) {
      sum = sum.add(get(n - m * j, m - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
