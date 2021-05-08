package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343986 Numbers that are the sum of four positive cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A343986 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343986() {
    super(3, 4, 5, true, false);
  }
}
