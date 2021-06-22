package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345551 Numbers that are the sum of ten cubes in three or more ways.
 * @author Sean A. Irvine
 */
public class A345551 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345551() {
    super(3, 10, 3);
  }
}
