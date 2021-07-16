package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346327 Numbers that are the sum of eight fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A346327 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346327() {
    super(5, 8, 2, true, false);
  }
}
