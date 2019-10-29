package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027356 Array read by rows: <code>T(n,k) =</code> number of partitions of n into distinct odd parts in which k is the greatest part, for <code>k=1,2,...,n, n&gt;=1</code>.
 * @author Sean A. Irvine
 */
public class A027356 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n > m * m) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    final long p = 2 * m - 1;
    if (p > n) {
      return get(n, m - 1);
    }
    return get(n, m - 1).add(get(n - p, m - 1));
  }

  protected Z t(final long n, final long m) {
    return (m & 1) == 0 ? Z.ZERO : get(n - m, (m - 1) / 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
