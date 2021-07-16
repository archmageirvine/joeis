package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346331 Numbers that are the sum of eight fifth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A346331 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346331() {
    super(5, 8, 6, true, false);
  }
}
