package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346348 Numbers that are the sum of ten fifth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A346348 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346348() {
    super(5, 10, 3, true, false);
  }
}
