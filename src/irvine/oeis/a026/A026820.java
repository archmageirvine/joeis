package irvine.oeis.a026;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A026820 Euler's table: triangular array T read by rows, where T(n,k) = number of partitions in which every part is &lt;= k for 1 &lt;= k &lt;= n. Also number of partitions of n into at most k parts.
 * @author Sean A. Irvine
 */
public class A026820 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 1) {
      return Z.ONE;
    }
    return m > n ? get(n, m - 1) : get(n, m - 1).add(get(n - m, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
