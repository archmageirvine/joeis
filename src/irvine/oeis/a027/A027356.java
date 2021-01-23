package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027356 Array read by rows: T(n,k) = number of partitions of n into distinct odd parts in which k is the greatest part, for k=1,2,...,n, n&gt;=1.
 * @author Sean A. Irvine
 */
public class A027356 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = 0;
  private long mK = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n > k * k) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    final long p = 2 * k - 1;
    if (p > n) {
      return get(n, k - 1);
    }
    return get(n, k - 1).add(get(n - p, k - 1));
  }

  protected Z t(final long n, final long m) {
    return (m & 1) == 0 ? Z.ZERO : get(n - m, (m - 1) / 2);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return t(mN, mK);
  }
}
