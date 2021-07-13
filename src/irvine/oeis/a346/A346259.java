package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346259 Numbers that are the sum of seven fifth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A346259 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346259() {
    super(5, 7, 10, true, false);
  }
}
