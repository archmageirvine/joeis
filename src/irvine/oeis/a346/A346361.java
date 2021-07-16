package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346361 Numbers that are the sum of six fifth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A346361 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346361() {
    super(5, 6, 6, true, false);
  }
}
