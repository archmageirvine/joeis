package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A152578 Numbers of the form 5^(2^n) + 2.
 * @author Georg Fischer
 */
public class A152578 implements SequenceWithOffset {

  private int mN;
  private Z mBase;
  private int mOffset;

  /** Construct the sequence. */
  public A152578() {
    this(0, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base number base to be exponentiated
   */
  public A152578(final int offset, final int base) {
    mOffset = offset;
    mN = -1;
    mBase = Z.valueOf(base);
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    return mBase.pow(1L << ++mN).add(2);
  }
}
