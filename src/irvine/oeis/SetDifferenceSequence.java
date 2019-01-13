package irvine.oeis;

import irvine.math.z.Z;

/**
 * Difference between two sequences.
 * @author Sean A. Irvine
 */
public class SetDifferenceSequence implements Sequence {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private Z mNextA;
  private Z mNextB;

  /**
   * Difference of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public SetDifferenceSequence(final Sequence a, final Sequence b) {
    mSeqA = a;
    mSeqB = b;
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (mNextA.equals(mNextB)) {
        mNextA = mSeqA.next();
        mNextB = mSeqB.next();
        continue;
      }
      if (mNextA.compareTo(mNextB) < 0) {
        final Z res = mNextA;
        mNextA = mSeqA.next();
        return res;
      } else {
        mNextB = mSeqB.next();
      }
    }
  }
}
