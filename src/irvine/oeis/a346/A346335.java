package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346335 Numbers that are the sum of eight fifth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A346335 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346335() {
    super(5, 8, 10, true, false);
  }
}
