package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346363 Numbers that are the sum of six fifth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A346363 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346363() {
    super(5, 6, 8, true, false);
  }
}
