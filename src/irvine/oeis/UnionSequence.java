package irvine.oeis;

import irvine.math.z.Z;

/**
 * Union between two sequences.
 * @author Sean A. Irvine
 */
public class UnionSequence implements Sequence {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private Z mNextA;
  private Z mNextB;

  /**
   * Union of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public UnionSequence(final Sequence a, final Sequence b) {
    mSeqA = a;
    mSeqB = b;
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  @Override
  public Z next() {
    final Z t;
    if (mNextA.equals(mNextB)) {
      t = mNextA;
      mNextB = mSeqB.next();
      mNextA = mSeqA.next();
    } else if (mNextA.compareTo(mNextB) < 0) {
      t = mNextA;
      mNextA = mSeqA.next();
    } else {
      t = mNextB;
      mNextB = mSeqB.next();
    }
    return t;
  }
}
