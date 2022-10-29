package irvine.oeis;

import java.util.function.Predicate;

import irvine.math.z.Z;

/**
 * A sequence consisting of the positions of consecutive records in another sequence.
 * Derived from <code>RecordPositionSequence</code>.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class FilterPositionSequence extends FilterSequence {

  private long mN; // current index

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param predicate condition for accepting terms
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final Predicate<Z> predicate) {
    super(offset, seq, predicate);
    mN = start - 1;
  }

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param predicate condition for accepting terms
   */
  public FilterPositionSequence(final int start, final Sequence seq, final Predicate<Z> predicate) {
    this(1, start, seq, predicate);
  }

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final Z value) {
    this(offset, start, seq, value::equals);
  }

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param offset first index
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public FilterPositionSequence(final int offset, final int start, final Sequence seq, final long value) {
    this(offset, start, seq, Z.valueOf(value));
  }

  /**
   * Creates a sequence of the positions where a digit occurs in another sequence.
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   * @param value the positions of this number are returned
   */
  public FilterPositionSequence(final int start, final Sequence seq, final long value) {
    this(1, start, seq, value);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mPredicate.test(mSeq.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
