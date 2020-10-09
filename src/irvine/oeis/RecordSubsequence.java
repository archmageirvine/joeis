package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of consecutive records in another sequence.
 * In contrast to {@link RecordSequence}, this class does not compare the absolute value.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class RecordSubsequence extends Subsequence {

  protected Z mMax; 

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   */
  public RecordSubsequence(final Sequence seq) {
    super(seq);
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
