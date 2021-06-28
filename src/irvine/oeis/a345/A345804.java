package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345804 Numbers that are the sum of ten cubes in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345804 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345804() {
    super(3, 10, 2, true, false);
  }
}
