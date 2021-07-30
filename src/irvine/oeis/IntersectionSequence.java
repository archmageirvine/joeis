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

  /**
   * Intersection of three sequences.
   * @param a first sequence
   * @param b second sequence
   * @param c third sequence
   */
  public IntersectionSequence(final Sequence a, final Sequence b, final Sequence c) {
    this(new IntersectionSequence(a, b), c);
  }

  @Override
  public Z next() {
    while (true) {
      if (mNextA == null || mNextB == null) {
        return null; // Handle finite sequences
      }
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
