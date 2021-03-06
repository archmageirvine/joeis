package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346280 Numbers that are the sum of seven fifth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A346280 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346280() {
    super(5, 7, 3, true, false);
  }
}
