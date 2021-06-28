package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345811 Numbers that are the sum of ten cubes in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345811 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345811() {
    super(3, 10, 9, true, false);
  }
}
