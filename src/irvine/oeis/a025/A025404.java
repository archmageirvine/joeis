package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025404 Numbers that are the sum of 4 positive cubes in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A025404 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025404() {
    super(3, 4, 2, true, false);
  }
}
