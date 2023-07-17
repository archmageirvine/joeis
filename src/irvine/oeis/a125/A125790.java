package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A125790 Rectangular table where column k equals row sums of matrix power A078121^k, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A125790 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A125790() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A125790(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mK = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    return n == 0 || k == 0 ? Z.ONE : get(n, k - 1).add(get(n - 1, 2 * k));
  }

  @Override
  public Z next() {
    if (mK > mN) {
      ++mN;
      mK = 0;
    }
    return get(mN - mK, mK++);
  }

}

