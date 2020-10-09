package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of consecutive records in another sequence.
 * In contrast to {@link RecordSequence}, this class does not compare the absolute value.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class Subsequence implements Sequence {

  protected final Sequence mSeq; // the underlying sequence

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   */
  public Subsequence(final Sequence seq) {
    mSeq = seq;
  }

  /**
   * Defines the condition for the inclusion of a term of the underlying sequence
   * into this subsequence.
   * This method is typically overwritten with some different condition.
   * @param term term of the underlying sequence
   * @return true if the term should be included, false otherwise.
   * This default implementation takes all terms from the underlying sequence.
   */
  public boolean isOk(final Z term) {
    return true;
  }
  
  /**
   * Gets the next term of the subsequence.
   * @return the next term that fulfills the condition.
   */
  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next();
      if (isOk(t)) {
        return t;
      }
    }
  }
}
