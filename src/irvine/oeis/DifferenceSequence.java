package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the nth difference sequence of a sequence.
 * @author Sean A. Irvine
 */
public class DifferenceSequence implements Sequence {

  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Create a sequence which is the nth difference of the given sequence.
   * @param sequence underlying sequence
   * @param n difference level
   * @return difference sequence.
   */
  public static Sequence create(final Sequence sequence, final int n) {
    if (n == 0) {
      return sequence;
    }
    return create(new DifferenceSequence(sequence), n - 1);
  }

  /**
   * Create a sequence which is first difference of the given sequence.
   * @param sequence underlying sequence
   * @return difference sequence.
   */
  public static Sequence create(final Sequence sequence) {
    return new DifferenceSequence(sequence);
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param seq underlying sequence
   */
  public DifferenceSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = mSeq.next();
    }
    final Z t = mPrev;
    mPrev = mSeq.next();
    return mPrev.subtract(t);
  }
}
