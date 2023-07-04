package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of position of consecutive records in another sequence.
 * @author Sean A. Irvine
 */
public class RecordPositionSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  protected final Sequence mSeq;
  protected Z mMax = Z.NEG_ONE;
  protected long mN;

  /**
   * Creates a record position sequence of another sequence.
   * @param seq underlying sequence
   * @param initialPosition the initial offset of the sequence
   */
  public RecordPositionSequence(final Sequence seq, final long initialPosition) {
    this(DEFOFF, seq, initialPosition);
  }

  /**
   * Creates a record position sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param initialPosition the initial offset of the sequence
   */
  public RecordPositionSequence(final int offset, final Sequence seq, final long initialPosition) {
    super(offset);
    mSeq = seq;
    mN = initialPosition - 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mSeq.next().abs();
      if (t.compareTo(mMax) > 0) {
        mMax = t;
        return Z.valueOf(mN);
      }
    }
  }
}
