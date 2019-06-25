package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008284 Triangle of partition numbers: <code>T(n,k) =</code> number of partitions of n in which the greatest part is k, <code>1 &lt;= k &lt;= n</code>. Also number of partitions of n into k positive parts, <code>1 &lt;= k &lt;= n</code>.
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

