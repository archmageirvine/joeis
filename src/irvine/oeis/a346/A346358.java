package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346358 Numbers that are the sum of six fifth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A346358 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346358() {
    super(5, 6, 3, true, false);
  }
}
