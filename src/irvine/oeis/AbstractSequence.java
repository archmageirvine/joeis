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
}
