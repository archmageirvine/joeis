package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of the indices of consecutive records in another sequence.
 * In contrast to {@link RecordSequence}, this class does not compare the absolute value.
 * @author Georg Fischer
 */
public class RecordPositionSubsequence extends PositionSubsequence {

  protected Z mMax; 

  /**
   * Creates a record position sequence of another sequence.
   * @param offset index of first term of the underlying sequence.
   * @param seq underlying sequence
   */
  public RecordPositionSubsequence(final int offset, final Sequence seq) {
    super(offset, seq);
    mMax = null;
  }

  /**
   * Defines the condition for the inclusion of a term of the underlying sequence
   * into this subsequence.
   * @param term term of the underlying sequence
   * @return true if the term should be included, false otherwise.
   */
  @Override
  public boolean isOk(final Z term) {
    if (mMax == null || term.compareTo(mMax) > 0) {
      mMax = term;
      return true;
    } else {
      return false;
    }
  }
}
