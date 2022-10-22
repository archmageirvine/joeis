package irvine.oeis;

import irvine.math.z.Z;

/**
 * Difference between two sequences.
 * @author Sean A. Irvine
 */
public class SetDifferenceSequence extends AbstractSequence {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private Z mNextA;
  private Z mNextB;

  /**
   * Difference of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public SetDifferenceSequence(final int offset, final Sequence a, final Sequence b) {
    super(offset);
    mSeqA = a;
    mSeqB = b;
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  /**
   * Difference of a pair of sequences.
   * @param a first sequence
   * @param b second sequence
   */
  public SetDifferenceSequence(final Sequence a, final Sequence b) {
    this(1, a, b);
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

  /**
   * Compute the sequence <code>a</code> minus all the other given sequences.
   * @param a first sequence
   * @param bs sequences to subtract
   * @return set difference sequence
   */
  public static Sequence create(final Sequence a, final Sequence... bs) {
    Sequence res = a;
    for (final Sequence b : bs) {
      res = new SetDifferenceSequence(res, b);
    }
    return res;
  }
}
