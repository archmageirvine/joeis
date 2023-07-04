package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence that gives the positions (indices) of the terms of the underlying sequence
 * that fulfill some condition.
 * @author Georg Fischer
 */
public class AddConstantSequence extends AbstractSequence {

  protected Sequence mSeq; // underlying sequence
  protected Z mC; // constant to be added
  
  /**
   * Adds a constant to another sequence.
   * @param c constant to be added
   * @param seq underlying sequence
   */
  public AddConstantSequence(final long c, final Sequence seq) {
    super(seq.getOffset());
    mSeq = seq;
    mC = Z.valueOf(c);
  }

  /**
   * Adds a constant to another sequence.
   * @param c constant to be added
   * @param seq underlying sequence
   */
  public AddConstantSequence(final Z c, final Sequence seq) {
    super(seq.getOffset());
    mSeq = seq;
    mC = c;
  }

  @Override
  public Z next() {
    return mSeq.next().add(mC);
  }
}
