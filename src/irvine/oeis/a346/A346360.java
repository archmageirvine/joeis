package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346360 Numbers that are the sum of six fifth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A346360 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346360() {
    super(5, 6, 5, true, false);
  }
}
