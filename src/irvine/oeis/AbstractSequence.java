package irvine.oeis;

/**
 * A base class for a sequence that deals with storing the sequence offset.
 * @author Sean A. Irvine
 */
public abstract class AbstractSequence implements Sequence {

  private int mOffset;

  /**
   * Construct the sequence with the specified offset.
   * @param offset OEIS offset
   */
  protected AbstractSequence(final int offset) {
    mOffset = offset;
  }

  @Override
  public final int getOffset() {
    return mOffset;
  }

  /**
   * Set the offset associated with this sequence.
   * @param offset the offset
   */
  public void setOffset(final int offset) {
    // This next block can be uncommented and Report run to detect needless setting of the offset
//    if (offset == mOffset) {
//      String clazz = null;
//      for (final StackTraceElement ste : new RuntimeException().getStackTrace()) {
//        if (ste.toString().matches(".*A[0-9]{6}.*")) {
//          clazz = ste.toString();
//        }
//      }
//      System.out.println("Redundant call to setOffset in " + clazz);
//    }
    mOffset = offset;
  }

  @Override
  public AbstractSequence skip(final long terms) {
    if (terms < 0) {
      throw new IllegalArgumentException();
    }
    for (long k = 0; k < terms; ++k) {
      if (next() == null) {
        return this;
      }
    }
    return this;
  }

  @Override
  public AbstractSequence skip() {
    return skip(1);
  }
}
