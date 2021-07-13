package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346286 Numbers that are the sum of seven fifth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A346286 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346286() {
    super(5, 7, 9, true, false);
  }
}
