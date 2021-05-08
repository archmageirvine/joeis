package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343988 Numbers that are the sum of four positive cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A343988 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343988() {
    super(3, 5, 5, true, false);
  }
}
