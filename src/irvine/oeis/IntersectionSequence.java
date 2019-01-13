package irvine.oeis;

import irvine.math.z.Z;

/**
 * Intersection between two sequences.
 * @author Sean A. Irvine
 */
public class IntersectionSequence implements Sequence {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private Z mNextA;
  private Z mNextB;

  /**
   * Intersection of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public IntersectionSequence(final Sequence a, final Sequence b) {
    mSeqA = a;
    mSeqB = b;
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (mNextA.equals(mNextB)) {
        mNextB = mSeqB.next();
        return mNextA;
      }
      if (mNextA.compareTo(mNextB) < 0) {
        mNextA = mSeqA.next();
      } else {
        mNextB = mSeqB.next();
      }
    }
  }
}
