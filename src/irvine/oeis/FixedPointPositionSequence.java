package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence yielding the positions of fixed points in another sequence.
 * That is, returns indices <code>k</code> such that <code>seq(k)=k</code>
 * @author Sean A. Irvine
 */
public class FixedPointPositionSequence extends AbstractSequence {

  private final Sequence mSeq;
  private Z mPos;

  /**
   * Fixed positions sequence.
   * @param offset offset for this sequence
   * @param seq underlying sequence
   * @param start offset of underlying sequence
   */
  public FixedPointPositionSequence(final int offset, final Sequence seq, final int start) {
    super(offset);
    mSeq = seq;
    mPos = Z.valueOf(start - 1);
  }

  /**
   * Fixed positions sequence.
   * @param offset offset for this sequence
   * @param seq underlying sequence
   */
  public FixedPointPositionSequence(final int offset, final AbstractSequence seq) {
    this(offset, seq, seq.getOffset());
  }

  /**
   * Fixed positions sequence.
   * @param seq underlying sequence
   */
  public FixedPointPositionSequence(final AbstractSequence seq) {
    this(1, seq, seq.getOffset());
  }

  @Override
  public Z next() {
    while (true) {
      mPos = mPos.add(1);
      final Z t = mSeq.next();
      if (t == null || t.equals(mPos)) {
        return t;
      }
    }
  }
}
