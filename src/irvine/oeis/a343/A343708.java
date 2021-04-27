package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343708 Numbers that are the sum of two positive cubes in exactly two ways.
 * @author Sean A. Irvine
 */
public class A343708 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343708() {
    super(3, 2, 2, true, false);
  }
}
