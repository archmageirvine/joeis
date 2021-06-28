package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345854 Numbers that are the sum of ten fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345854 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345854() {
    super(4, 10, 2, true, false);
  }
}
