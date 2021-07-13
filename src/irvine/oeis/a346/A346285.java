package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346285 Numbers that are the sum of seven fifth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A346285 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346285() {
    super(5, 7, 8, true, false);
  }
}
