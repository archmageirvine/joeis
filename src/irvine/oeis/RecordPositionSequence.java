package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of position of consecutive records in another sequence.
 * @author Sean A. Irvine
 */
public class RecordPositionSequence implements Sequence {

  private final Sequence mSeq;
  private Z mMax = Z.NEG_ONE;
  private long mN;

  /**
   * Creates a record position sequence of another sequence.
   * @param seq underlying sequence
   * @param initialPosition the initial offset of the sequence
   */
  public RecordPositionSequence(final Sequence seq, final long initialPosition) {
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
