package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence comprising the cycle, indistinct, unlabeled transform of another sequence.
 * Same as the <tt>CIK</tt> transform.
 * @author Sean A. Irvine
 */
public class CycleTransformSequence extends InverseMobiusTransformSequence {

  /**
   * Creates the transform.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public CycleTransformSequence(final Sequence seq, final int skip) {
    super(new LyndonTransformSequence(seq, skip), 1, Z.ONE);
  }
}
