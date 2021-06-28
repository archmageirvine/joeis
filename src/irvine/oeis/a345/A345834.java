package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345834 Numbers that are the sum of eight fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345834 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345834() {
    super(4, 8, 2, true, false);
  }
}
