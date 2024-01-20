package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the first difference sequence of a sequence.
 * @author Sean A. Irvine
 */
public class DifferenceSequence extends AbstractSequence {

  private final Sequence mSeq;
  private Z mPrev;
  private final boolean mAbsolute;

  /**
   * Create the first difference sequence of a sequence.
   * @param offset first index of the target sequence
   * @param seq underlying sequence
   */
  public DifferenceSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mAbsolute = false;
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param offset first index of the target sequence
   * @param seq underlying sequence
   * @param absolute whether to return absolute values
   */
  public DifferenceSequence(final int offset, final Sequence seq, final boolean absolute) {
    super(offset);
    mSeq = seq;
    mAbsolute = absolute;
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param seq underlying sequence
   */
  public DifferenceSequence(final Sequence seq, final boolean absolute) {
    this(0, seq, absolute);
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param seq underlying sequence
   * @param absolute whether to return absolute values
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
    return mAbsolute ? mPrev.subtract(t).abs() : mPrev.subtract(t);
  }
}
