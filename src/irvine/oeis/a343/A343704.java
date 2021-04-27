package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343704 Numbers that are the sum of five positive cubes in three or more ways.
 * @author Sean A. Irvine
 */
public class A343704 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343704() {
    super(3, 5, 3);
  }
}
