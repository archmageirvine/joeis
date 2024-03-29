package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346281 Numbers that are the sum of seven fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A346281 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346281() {
    super(5, 7, 4, true, false);
  }
}
