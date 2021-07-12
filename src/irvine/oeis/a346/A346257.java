package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344519 Numbers that are the sum of five fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A346257 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346257() {
    super(5, 5, 5, true, false);
  }
}
