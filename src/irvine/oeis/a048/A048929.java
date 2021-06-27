package irvine.oeis.a048;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A048929 Numbers that are the sum of 6 positive cubes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A048929 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A048929() {
    super(3, 6, 1, true, false);
  }
}
