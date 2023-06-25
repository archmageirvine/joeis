package irvine.oeis;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

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
    mAttr = BRIEF;
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public BriefSequence(final Z... seq) {
    super(seq);
    mAttr = BRIEF;
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public BriefSequence(final int offset, final String attr, final long... seq) {
    super(offset, attr, seq);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public BriefSequence(final int offset, final String attr, final Z... seq) {
    super(offset, attr, seq);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param attr attribute
   * @param seq the values
   */
  public BriefSequence(final int offset, final String attr, final String seq) {
    super(offset, attr, ZUtils.toZ(seq));
  }
}
