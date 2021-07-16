package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346328 Numbers that are the sum of eight fifth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A346328 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346328() {
    super(5, 8, 3, true, false);
  }
}
