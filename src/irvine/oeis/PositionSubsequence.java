package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence that gives the positions (indices) of the terms of the underlying sequence
 * that fulfill some condition.
 * @author Georg Fischer
 */
public class PositionSubsequence extends Subsequence implements SequenceWithOffset {

  protected int mN; // current index

  /**
   * Creates sequence of the indices of the terms in another sequence that fulfill some condition.
   * @param seq underlying sequence
   * @param start offset of <code>seq</code>
   */
  public PositionSubsequence(final Sequence seq, final int start) {
    super(seq);
    mN = start - 1;
  }

  @Override
  public int getOffset() {
    return 1; // is a list
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mSeq.next();
      if (isOk(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
