package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A048724 Write n and 2n in binary and add them mod 2.
 * @author Georg Fischer
 */
public class A048724 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mMult;

  /** Construct the sequence. */
  public A048724() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiplicative factor
   */
  public A048724(final int offset, final int mult) {
    mOffset = offset;
    mMult = mult;
    mN = offset - 1;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN ^ (mN * mMult));
  }
}
