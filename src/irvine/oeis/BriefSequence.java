package irvine.oeis;

import irvine.math.z.Z;

/**
 * Used as a base class for sequences which are not truly implemented, but which are
 * labelled <code>bref</code> in the OEIS and are likely hard to compute.
 * @author Sean A. Irvine
 */
public class BriefSequence extends NoncomputableSequence {

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public BriefSequence(final long... seq) {
    super(seq);
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public BriefSequence(final Z... seq) {
    super(seq);
  }
}

