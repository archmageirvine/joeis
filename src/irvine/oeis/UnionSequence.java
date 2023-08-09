package irvine.oeis;

import irvine.math.z.Z;

/**
 * Union between two sequences. Assumes input sequences are sorted.
 * @author Sean A. Irvine
 */
public class UnionSequence extends AbstractSequence {

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
    super(1);
    mSeqA = a;
    mSeqB = b;
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  /**
   * Union of sequences.
   * @param offset offset for the sequence
   * @param a first sequence
   * @param b other sequences
   */
  public UnionSequence(final int offset, final Sequence a, final Sequence... b) {
    super(offset);
    mSeqA = a;
    mSeqB = createUnion(b);
    mNextA = mSeqA.next();
    mNextB = mSeqB.next();
  }

  /**
   * Union of sequences.
   * @param a first sequence
   * @param b other sequences
   */
  public UnionSequence(final Sequence a, final Sequence... b) {
    this(1, a, b);
  }

  private Z update(final Z t, final Sequence seq) {
    Z u;
    do {
      u = seq.next();
    } while (t.equals(u));
    return u;
  }

  @Override
  public Z next() {
    final Z t;
    if (mNextA == null) {
      if (mNextB == null) {
        return null;
      }
      t = mNextB;
      mNextB = update(t, mSeqB);
    } else if (mNextB == null) {
      t = mNextA;
      mNextA = update(t, mSeqA);
    } else if (mNextA.equals(mNextB)) {
      t = mNextA;
      mNextA = update(t, mSeqA);
      mNextB = update(t, mSeqB);
    } else if (mNextA.compareTo(mNextB) < 0) {
      t = mNextA;
      mNextA = update(t, mSeqA);
    } else {
      t = mNextB;
      mNextB = update(t, mSeqB);
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
