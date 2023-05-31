package irvine.oeis;

import irvine.math.z.Z;

/**
 * Return the nth difference sequence of a sequence.
 * @author Sean A. Irvine
 */
public class DifferenceSequence extends AbstractSequence {

  private final Sequence mSeq;
  private Z mPrev;

  /**
   * Create a sequence which is the nth difference of the given sequence.
   * @param offset first index
   * @param sequence underlying sequence
   * @param n difference level
   * @return difference sequence.
   */
  public static Sequence create(final int offset, final Sequence sequence, final int n) {
    if (n == 0) {
      return sequence;
    }
    return create(offset, new DifferenceSequence(offset, sequence), n - 1);
  }

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
    return create(0, new DifferenceSequence(0, sequence), n - 1);
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
   * @param offset first index of the target sequence
   * @param seq underlying sequence
   */
  public DifferenceSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /**
   * Create the first difference sequence of a sequence.
   * @param seq underlying sequence
   */
  public DifferenceSequence(final Sequence seq) {
    this(0, seq);
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
