package irvine.oeis;

import irvine.math.z.Z;

/**
 * Additive closure formed by sums of distinct elements of a strictly increasing sequence.
 * @author Sean A. Irvine
 */
public class DistinctAdditiveClosureSequence extends DistinctMultiplicativeClosureSequence {

  /**
   * Construct the additive closure of distinct elements of another sequence.
   * @param seq underlying sequence.
   */
  public DistinctAdditiveClosureSequence(final Sequence seq) {
    super(seq, Z.ZERO);
  }

  @Override
  protected Z op(final Z a, final Z b) {
    return a.add(b);
  }

  @Override
  protected Z invOp(final Z a, final Z b) {
    return a.subtract(b);
  }
}
