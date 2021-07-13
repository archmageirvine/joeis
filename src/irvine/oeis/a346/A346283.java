package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346283 Numbers that are the sum of seven fifth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A346283 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346283() {
    super(5, 7, 6, true, false);
  }
}
