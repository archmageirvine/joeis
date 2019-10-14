package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026821 Triangular array T read by rows: <code>T(n,k) =</code> number of partitions of n into distinct parts, the least being k, for <code>k=1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A026821 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    final long r = (n + 1) / 2;
    if (m > r) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= n - 2 * m; ++k) {
      sum = sum.add(get(n - m, m + k));
    }
    return sum;
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
