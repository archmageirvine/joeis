package irvine.oeis.a048;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A048931 Numbers that are the sum of 6 positive cubes in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A048931 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A048931() {
    super(3, 6, 3, true, false);
  }
}
