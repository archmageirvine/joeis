package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A173426 a(n) is obtained by starting with 1, sequentially concatenating all decimal numbers up to n, and then, starting from n-1, sequentially concatenating all decimal numbers down to 1.
 * and then, starting from n-1, sequentially concatenating all decimal numbers down to 1.
 * @author Georg Fischer
 */
public class A173426 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mBase;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A173426() {
    this(1, 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base number base
   */
  public A173426(final int offset, final int base) {
    mOffset = offset;
    mN = offset - 1;
    mBase = base;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    mSb.setLength(0);
    for (int i = 1; i <= mN; ++i) {
      mSb.append(Z.valueOf(i).toString(mBase));
    }
    for (int i = mN - 1; i >= 1; --i) {
      mSb.append(Z.valueOf(i).toString(mBase));
    }
    return new Z(mSb.toString(), mBase);
  }
}
