package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346359 Numbers that are the sum of six fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A346359 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346359() {
    super(5, 6, 4, true, false);
  }
}
