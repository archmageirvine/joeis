package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025405 Numbers that are the sum of 4 positive cubes in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A025405 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025405() {
    super(3, 4, 3, true, false);
  }
}
