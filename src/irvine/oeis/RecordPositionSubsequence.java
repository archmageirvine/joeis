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
   * @param seq underlying sequence
   * @param offset index of first term of the underlying sequence.
   */
  public RecordPositionSubsequence(final Sequence seq, final int offset) {
    super(seq, offset);
    // A265913(1) -80561663527802406257321747 has current minimal 1st term
    mMax = new Z("-9999999999999999999999999999999999999999999999999999999999999999"); // 64 digits
  }

  /**
   * Defines the condition for the inclusion of a term of the underlying sequence
   * into this subsequence.
   * @param term term of the underlying sequence
   * @return true if the term should be included, false otherwise.
   */
  @Override
  public boolean isOk(final Z term) {
    if (term.compareTo(mMax) > 0) {
      mMax = term;
      return true;
    } else {
      return false;
    }
  }
}
