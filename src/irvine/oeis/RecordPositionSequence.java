package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of position of consecutive records in another sequence.
 * @author Sean A. Irvine
 */
public class RecordPositionSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final Sequence mSeq;
  private final boolean mUseAbs;
  private Z mMax = RecordSequence.DEFAULT_MIN;
  private long mN;

  /**
   * Creates a record position sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param initialPosition the initial offset of the sequence
   * @param useAbs should the absolute value of a term be considered
   */
  public RecordPositionSequence(final int offset, final Sequence seq, final long initialPosition, final boolean useAbs) {
    super(offset);
    mSeq = seq;
    mN = initialPosition - 1;
    mUseAbs = useAbs;
  }


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
    this(offset, seq, initialPosition, true);
  }

  /**
   * Creates a record position sequence of another sequence.
   * @param seq underlying sequence
   * @param initialPosition the initial offset of the sequence
   * @param useAbs should the absolute value of terms be taken
   */
  public RecordPositionSequence(final Sequence seq, final long initialPosition, final boolean useAbs) {
    this(DEFOFF, seq, initialPosition, useAbs);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mUseAbs ? mSeq.next().abs() : mSeq.next();
      if (t.compareTo(mMax) > 0) {
        mMax = t;
        return Z.valueOf(mN);
      }
    }
  }
}
