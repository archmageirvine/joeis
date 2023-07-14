package irvine.oeis;

/**
 * A sequence consisting of consecutive records in another sequence.
 * In contrast to {@link RecordSequence}, this class does not compare the absolute value.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class RecordSubsequence extends RecordSequence {

  private static final int DEFOFF = 1;

  /**
   * Creates a record sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public RecordSubsequence(final int offset, final Sequence seq) {
    super(offset, seq, false);
  }

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   */
  public RecordSubsequence(final Sequence seq) {
    this(DEFOFF, seq);
  }
}
