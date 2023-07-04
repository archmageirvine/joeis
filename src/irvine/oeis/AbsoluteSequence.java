package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence that yields the absolute values of the underlying sequence.
 * @author Georg Fischer
 */
public class AbsoluteSequence extends AbstractSequence {

  protected Sequence mSeq; // underlying sequence
  
  /**
   * Yields the absolute values of another sequence.
   * @param seq underlying sequence
   */
  public AbsoluteSequence(final Sequence seq) {
    super(seq instanceof SequenceWithOffset ? ((SequenceWithOffset) seq).getOffset() : 1);
    mSeq = seq;
  }

  @Override
  public Z next() {
    return mSeq.next().abs();
  }
}
