package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048887 Array T read by antidiagonals, where T(m,n) = number of compositions of n into parts &lt;= m.
 * @author Sean A. Irvine
 */
public class A048887 extends MemoryFunction2Sequence<Long, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A048887(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A048887() {
    super(1);
  }

  // After Alois P. Heinz

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 || m == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= Math.min(n, m); ++k) {
      sum = sum.add(get(n - k, m));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mM, 1 + mN - mM);
  }
}

