package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of the positions of consecutive records in another sequence.
 * Derived from <code>RecordPositionSequence</code>.
 * @author Georg Fischer
 */
public class PositionSequence extends AbstractSequence {

  protected final Sequence mSeq; // the underlying sequence
  protected Z mValue; // return the positions of this number
  protected long mN; // current index

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public PositionSequence(final int start, final Sequence seq, final long value) {
    this(1, start, seq, value);
  }

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public PositionSequence(final int offset, final int start, final Sequence seq, final long value) {
    super(offset);
    mSeq = seq;
    mValue = Z.valueOf(value);
    mN = start - 1;
  }

  /**
   * Determine whether the current number has the property which includes it in the sequence.
   * @param term number to be tested
   * This method may be overwritten in order to test some other property.
   * @return true iff the current number <code>mK</code> has some property.
   */
  protected boolean isOk(final Z term) {
    return term.equals(mValue);
  }

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
