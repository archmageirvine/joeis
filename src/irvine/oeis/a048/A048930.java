package irvine.oeis.a048;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A048930 Numbers that are the sum of 6 positive cubes in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A048930 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A048930() {
    super(3, 6, 2, true, false);
  }
}
