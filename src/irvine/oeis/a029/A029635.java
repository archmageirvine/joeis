package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A029635 The (1,2)-Pascal triangle (or Lucas triangle) read by rows.
 * @author Sean A. Irvine
 */
public class A029635 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A029635() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A029635(final int offset) {
    super(offset);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.TWO;
    }
    if (m == 0) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
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
