package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346279 Numbers that are the sum of seven fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A346279 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346279() {
    super(5, 7, 2, true, false);
  }
}
