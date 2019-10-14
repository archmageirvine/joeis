package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026820 Euler's table: triangular array T read by rows, where <code>T(n,k) =</code> number of partitions in which every part is <code>&lt;=</code> k for <code>1 &lt;= k &lt;= n</code>. Also number of partitions of n into at most k parts.
 * @author Sean A. Irvine
 */
public class A026820 extends MemoryFunction2<Long, Z> implements Sequence {

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
