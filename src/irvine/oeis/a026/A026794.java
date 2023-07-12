package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026794 Triangular array T read by rows: T(n,k) = number of partitions of n in which least part is k, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026794 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026794() {
    super(1);
  }

  private long mN = 0;
  private long mM = 1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m > n / 2) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long k = m; k <= n - m; ++k) {
      sum = sum.add(get(n - m, k));
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
