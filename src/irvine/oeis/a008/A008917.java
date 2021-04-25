package irvine.oeis.a008;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A008917 Numbers that are the sum of 3 positive cubes in more than one way.
 * @author Sean A. Irvine
 */
public class A008917 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A008917() {
    super(3, 3, 2);
  }
}
