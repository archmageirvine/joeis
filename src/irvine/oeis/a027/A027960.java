package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A027960 'Lucas array': triangular array T read by rows.
 * @author Sean A. Irvine
 */
public class A027960 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A027960() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027960(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m == 2 * n) {
      return Z.ONE;
    } else if (m == 1) {
      return Z.THREE;
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m - 1));
    }
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
