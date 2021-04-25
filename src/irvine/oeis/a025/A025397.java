package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025397 Numbers that are the sum of 3 positive cubes in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A025397 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025397() {
    super(3, 3, 3, true, false);
  }
}
