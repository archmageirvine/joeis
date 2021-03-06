package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345553 Numbers that are the sum of ten cubes in five or more ways.
 * @author Sean A. Irvine
 */
public class A345553 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345553() {
    super(3, 10, 5);
  }
}
