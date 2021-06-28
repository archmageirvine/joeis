package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345810 Numbers that are the sum of ten cubes in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345810 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345810() {
    super(3, 10, 8, true, false);
  }
}
