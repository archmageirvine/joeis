package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence that allows looking at the next item without actually
 * stepping the sequence.
 * @author Sean A. Irvine
 */
public class LookaheadSequence implements Sequence {

  private final Sequence mSeq;
  private Z mNext;

  /**
   * Create the lookahead sequence.
   * @param seq underlying sequence
   */
  public LookaheadSequence(final Sequence seq) {
    mSeq = seq;
    mNext = seq.next();
  }

  /**
   * Retrieve the next value of the sequence, but do not step the sequence.
   * @return value of the sequence
   */
  public Z peek() {
    return mNext;
  }

  @Override
  public Z next() {
    final Z t = mNext;
    mNext = mSeq.next();
    return t;
  }
}
