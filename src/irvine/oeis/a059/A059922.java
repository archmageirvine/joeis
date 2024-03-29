package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059922 Each term in the table is the product of the two terms above it + 1.
 * @author Sean A. Irvine
 */
public class A059922 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059922() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A059922(final int offset) {
    super(offset);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n > m || n < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).multiply(get(n, m - 1)).add(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN);
  }
}

