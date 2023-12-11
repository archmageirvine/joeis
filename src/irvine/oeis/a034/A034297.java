package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A034297 Number of ordered positive integer solutions (m_1, m_2, ..., m_k) (for some k) to Sum_{i=1..k} m_i=n with |m_i-m_{i-1}| &lt;= 1 for i = 2 ... k.
 * @author Sean A. Irvine
 */
public class A034297 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (n < 0 || m < 1) {
      return Z.ZERO;
    }
    return get(n - m, m - 1).add(get(n - m, m)).add(get(n - m, m + 1));
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
