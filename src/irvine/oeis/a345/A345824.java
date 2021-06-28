package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345824 Numbers that are the sum of seven fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345824 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345824() {
    super(4, 7, 2, true, false);
  }
}
