package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346365 Numbers that are the sum of six fifth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A346365 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346365() {
    super(5, 6, 10, true, false);
  }
}
