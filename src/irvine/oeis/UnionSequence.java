package irvine.oeis;

import irvine.math.z.Z;

/**
 * Union between two sequences. Assumes input sequences are sorted.
 * @author Sean A. Irvine
 */
public class UnionSequence implements SequenceWithOffset {

  private final Sequence mSeqA;
  private final Sequence mSeqB;
  private Z mNextA;
  private Z mNextB;
  protected int mOffset = 1;

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

  /**
   * Union of sequences.
   * @param a first sequence
   * @param b other sequences
   */
  public UnionSequence(final Sequence a, final Sequence... b) {
    mSeqA = a;
    mSeqB = createUnion(b);
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    final Z t;
    if (mNextA == null) {
      t = mNextB;
      mNextB = mSeqB.next();
    } else if (mNextB == null) {
      t = mNextA;
      mNextA = mSeqA.next();
    } else if (mNextA.equals(mNextB)) {
      t = mNextA;
      do {
        mNextB = mSeqB.next();
      } while (t.equals(mNextB));
      do {
        mNextA = mSeqA.next();
      } while (t.equals(mNextA));
    } else if (mNextA.compareTo(mNextB) < 0) {
      t = mNextA;
      mNextA = mSeqA.next();
    } else {
      t = mNextB;
      mNextB = mSeqB.next();
    }
    return t;
  }

  /**
   * Construct the union of an arbitrary number of sequences.
   * @param sequences sequences to form union of
   * @return union
   */
  public static Sequence createUnion(final Sequence... sequences) {
    if (sequences == null || sequences.length == 0) {
      return null;
    }
    Sequence t = sequences[0];
    for (int k = 1; k < sequences.length; ++k) {
      t = new UnionSequence(t, sequences[k]);
    }
    return t;
  }
}
