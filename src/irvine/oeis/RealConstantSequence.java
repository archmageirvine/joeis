package irvine.oeis;

import irvine.math.cr.CR;

/**
 * Sequence formed by the decimal expansion of a computable real number.
 * @author Sean A. Irvine
 */
public abstract class RealConstantSequence implements Sequence {

  private long mOffset;
  private CR mX;

  /**
   * Construct a sequence with given offset and based on a particular real number.
   * @param offset the offset of the sequence
   * @param x computable real number
   */
  protected RealConstantSequence(final long offset, final CR x) {
    mOffset = offset;
    mX = x;
  }

  protected CR getCR() {
    return mX;
  }

  protected long getOffset() {
    return mOffset;
  }
}
