package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence that gives the positions (indices) of the terms of the underlying sequence
 * that fulfill some condition.
 * @author Georg Fischer
 */
public class PositionSubsequence extends Subsequence {

  protected int mN; // current index

  /**
   * Creates sequence of the indices of the terms in another sequence that fulfill some condition.
   * @param seq underlying sequence
   * @param offset sequence offset
   */
  public PositionSubsequence(final Sequence seq, final int offset) {
    super(seq);
    mN = offset - 1;
  }

  /**
   * Defines the condition for the inclusion of a term of the underlying sequence
   * into this subsequence.
   * This method is typically overwritten with some different condition.
   * @param term term of the underlying sequence
   * @return true if the term should be included, false otherwise.
   * This default implementation returns the numbers starting at offset.
   */
  public boolean isOk(final Z term) {
    return true;
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
