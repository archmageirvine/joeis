package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346349 Numbers that are the sum of ten fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A346349 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346349() {
    super(5, 10, 4, true, false);
  }
}
