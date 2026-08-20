package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A125790 Rectangular table where column k equals row sums of matrix power A078121^k, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A125790 extends MemoryFunction2Sequence<Long, Z> implements DirectArray {

  private final int mExpon;

  /** Construct the sequence. */
  public A125790() {
    this(0, 2);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A125790(final int offset) {
    super(offset);
    mExpon = 2;
  }

  /**
   * Constructor with offset and parameter.
   * @param offset first index
   * @param expon exponent
   */
  protected A125790(final int offset, final int expon) {
    super(offset);
    mExpon = expon;
  }

  private long mN = -1;
  private long mK = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    return n == 0 || k == 0 ? Z.ONE : get(n, k - 1).add(get(n - 1, mExpon * k));
  }

  @Override
  public Z next() {
    if (mK > mN) {
      ++mN;
      mK = 0;
    }
    return get(mN - mK, mK++);
  }


  @Override
  public Z a(final long n, final long k) {
    return get(n, k);
  }

}

