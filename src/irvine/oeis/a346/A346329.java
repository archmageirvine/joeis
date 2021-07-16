package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346329 Numbers that are the sum of eight fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A346329 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346329() {
    super(5, 8, 4, true, false);
  }
}
