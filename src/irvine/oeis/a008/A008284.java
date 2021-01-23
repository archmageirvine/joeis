package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008284 Triangle of partition numbers: T(n,k) = number of partitions of n in which the greatest part is k, 1 &lt;= k &lt;= n. Also number of partitions of n into k positive parts, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A008284 extends MemoryFunction2<Long, Z> implements Sequence {

  @Override
  protected Z compute(final Long n, final Long k) {
    return get(n - 1, k - 1).add(get(n - k, k));
  }

  @Override
  public Z get(final Long n, final Long k) {
    if (k == 1 || n.equals(k)) {
      return Z.ONE;
    }
    if (k > n) {
      return Z.ZERO;
    }
    return super.get(n, k);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
