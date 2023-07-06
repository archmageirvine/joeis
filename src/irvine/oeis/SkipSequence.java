package irvine.oeis;

import irvine.math.z.Z;

/**
 * A wrapper that skips the specified number of terms in the underlying sequence.
 * @author Sean A. Irvine
 */
public class SkipSequence extends AbstractSequence {

  private static final int DEFOFF = 1;

  private final Sequence mSeq;

  /**
   * Skipped sequence.
   * @param seq sequence to skip
   * @param skip number of terms to skip
   */
  public SkipSequence(final Sequence seq, final long skip) {
    this(DEFOFF, seq, skip);
  }

  /**
   * Skipped sequence.
   * @param offset first index of target sequence
   * @param seq sequence to skip
   * @param skip number of terms to skip
   */
  public SkipSequence(final int offset, final Sequence seq, final long skip) {
    super(offset);
    mSeq = seq;
    for (long k = 0; k < skip; ++k) {
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
