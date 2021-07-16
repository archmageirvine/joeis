package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346339 Numbers that are the sum of nine fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A346339 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346339() {
    super(5, 9, 4, true, false);
  }
}
