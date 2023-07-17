package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A047080 Triangular array T read by rows: T(h,k)=number of paths from (0,0) to (k,h-k) using step-vectors (0,1), (1,0), (1,1) with no right angles between pairs of consecutive steps.
 * @author Sean A. Irvine
 */
public class A047080 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A047080() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A047080(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 0 || m > n) {
      return Z.ZERO;
    }
    if (n < 3) {
      return Z.ONE;
    }
    if (2 * m < n) {
      return get(n, n - m);
    }
    return get(n - 1, m - 1).add(get(n - 1, m)).subtract(get(n - 4, m - 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
