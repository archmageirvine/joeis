package irvine.oeis;

import irvine.math.z.Z;

/**
 * Complement of a monotonically increasing sequence.
 * @author Sean A. Irvine
 */
public class ComplementSequence implements Sequence {

  private final Sequence mSeq;
  private Z mN;
  private Z mCurrent;

  /**
   * Complement of a sequence.
   * @param seq sequence to complement
   * @param start start value
   */
  public ComplementSequence(final Sequence seq, final Z start) {
    mSeq = seq;
    mN = start;
    mCurrent = mSeq.next();
  }

  /**
   * Complement of a sequence starting at 0.
   * @param seq sequence to complement
   */
  public ComplementSequence(final Sequence seq) {
    this(seq, Z.ZERO);
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
