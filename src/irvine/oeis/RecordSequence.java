package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of consecutive records in another sequence.
 * @author Sean A. Irvine
 */
public class RecordSequence implements Sequence {

  private final Sequence mSeq;
  private Z mMax;

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   * @param initial the initial maximum
   */
  public RecordSequence(final Sequence seq, final Z initial) {
    mSeq = seq;
    mMax = initial;
  }

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   */
  public RecordSequence(final Sequence seq) {
    this(seq, Z.NEG_ONE);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next().abs();
      if (t.compareTo(mMax) > 0) {
        mMax = t;
        return mMax;
      }
    }
  }
}
