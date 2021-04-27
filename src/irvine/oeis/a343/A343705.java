package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343705 Numbers that are the sum of five positive cubes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A343705 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343705() {
    super(3, 5, 3, true, false);
  }
}
