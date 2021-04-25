package irvine.oeis.a048;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A048927 Numbers that are the sum of 5 positive cubes in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A048927 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A048927() {
    super(3, 5, 2, true, false);
  }
}
