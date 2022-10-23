package irvine.oeis;

/**
 * A base class for a sequence that deals with storing the sequence offset.
 * @author Sean A. Irvine
 */
public abstract class AbstractSequence implements SequenceWithOffset {

  private int mOffset;

  protected AbstractSequence(final int offset) {
    mOffset = offset;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  /**
   * Set the offset associated with this sequence.
   * @param offset the offset
   */
  public void setOffset(final int offset) {
    mOffset = offset;
  }
}
