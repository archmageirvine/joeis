package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A029653 Numbers in (2,1)-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A029653 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A029653() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A029653(final int offset) {
    super(offset);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m == 0) {
      return Z.TWO;
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
