package irvine.oeis;

import irvine.math.z.Z;

/**
 * Partial sums of another sequence.
 * @author Sean A. Irvine
 */
public class PartialSumSequence extends AbstractSequence {

  private final Sequence mSeq;
  protected Z mSum = Z.ZERO;

  /**
   * Partial sums of another sequence.
   * @param offset sequence offset
   * @param seq sequence to compute partial sums of
   */
  public PartialSumSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /**
   * Partial sums of another sequence.
   * @param seq sequence to compute partial sums of
   */
  public PartialSumSequence(final Sequence seq) {
    this(0, seq);
  }

  @Override
  public Z next() {
    if (mSum != null) {
      final Z t = mSeq.next();
      if (t == null) {
        mSum = null;
      } else {
        mSum = mSum.add(t);
      }
    }
    return mSum;
  }
}
