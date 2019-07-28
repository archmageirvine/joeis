package irvine.oeis;

import irvine.math.z.Z;

/**
 * Partial sums of another sequence.
 * @author Sean A. Irvine
 */
public class PartialSumSequence implements Sequence {

  private final Sequence mSeq;
  protected Z mSum = Z.ZERO;

  /**
   * Partial sums of another sequence.
   * @param seq sequence to compute partial sums of
   */
  public PartialSumSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    mSum = mSum.add(mSeq.next());
    return mSum;
  }
}
