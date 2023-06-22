package irvine.oeis;

import irvine.math.z.Z;

/**
 * Complement of a monotonically increasing sequence.
 * @author Sean A. Irvine
 */
public class ComplementSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final Sequence mSeq;
  private Z mN;
  private Z mCurrent;

  /**
   * Complement of a sequence.
   * @param seq sequence to complement
   * @param start start value
   */
  public ComplementSequence(final Sequence seq, final Z start) {
    this(DEFOFF, seq, start);
  }

  /**
   * Complement of a sequence starting at 0.
   * @param seq sequence to complement
   */
  public ComplementSequence(final Sequence seq) {
    this(DEFOFF, seq, Z.ZERO);
  }

  /**
   * Complement of a sequence.
   * @param offset first index
   * @param seq sequence to complement
   * @param start start value
   */
  public ComplementSequence(final int offset, final Sequence seq, final Z start) {
    super(offset);
    mSeq = seq;
    mN = start;
    mCurrent = mSeq.next();
  }

  /**
   * Complement of a sequence starting at 0.
   * @param offset first index
   * @param seq sequence to complement
   */
  public ComplementSequence(final int offset, final Sequence seq) {
    this(offset, seq, Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      while (mCurrent != null && mCurrent.compareTo(mN) < 0) {
        final Z t = mSeq.next();
        if (t != null && mCurrent.compareTo(t) > 0) {
          throw new UnsupportedOperationException("Underlying sequence is not monotonic increasing");
        }
        mCurrent = t;
      }
      final Z t = mN;
      mN = mN.add(1);
      if (!t.equals(mCurrent)) {
        return t;
      }
    }
  }
}
