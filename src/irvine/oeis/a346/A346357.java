package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346357 Numbers that are the sum of six fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A346357 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346357() {
    super(5, 6, 2, true, false);
  }
}
