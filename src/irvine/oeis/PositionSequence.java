package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of position of consecutive records in another sequence.
 * Derived from <code>RecordPositionSequence</code>.
 * @author Georg Fischer
 */
public class PositionSequence implements Sequence {

  private final Sequence mSeq; // the underlying sequence
  private Z mValue; // return the positions of this number
  private long mN; // current index

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param seq underlying sequence
   * @param offset offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public PositionSequence(final int offset, final Sequence seq, final long value) {
    mSeq = seq;
    mValue = Z.valueOf(value);
    mN = offset - 1;
  }

  /**
   * Determine whether the current number has the property which includes it in the sequence.
   * @param term number to be tested
   * This method may be overwritten in order to test some other property.
   * @return true iff the current number <code>mK</code> has some property.
   */
  protected boolean isOk(final Z term) {
    return term.compareTo(mValue) == 0;
  } // isOk

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mSeq.next();
      if (isOk(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
