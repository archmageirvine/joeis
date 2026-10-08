package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence that allows looking ahead by one value
 * @author Sean A. Irvine
 */
public class PeekSequence extends AbstractSequence {

  private final Sequence mSeq;
  private Z mNext;

  /**
   * Construct a new peeking sequence.
   * @param seq underlying sequence
   */
  public PeekSequence(final Sequence seq) {
    super(seq.getOffset());
    mSeq = seq;
    mNext = seq.next();
  }

  /**
   * Return the value which will returned by the next call to <code>next()</code>.
   * @return next value
   */
  public Z peek() {
    return mNext;
  }

  @Override
  public Z next() {
    final Z res = mNext;
    mNext = mSeq.next();
    return res;
  }
}
