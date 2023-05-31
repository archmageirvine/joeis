package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the nth difference sequence of a sequence.
 * @author Sean A. Irvine
 */
public class DifferenceSequence extends AbstractSequence {

  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Create the first difference sequence of a sequence.
   * @param offset first index of the target sequence
   * @param seq underlying sequence
   */
  public DifferenceSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param seq underlying sequence
   */
  public DifferenceSequence(final Sequence seq) {
    this(0, seq);
  }

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = mSeq.next();
    }
    final Z t = mPrev;
    mPrev = mSeq.next();
    return mPrev.subtract(t);
  }
}
