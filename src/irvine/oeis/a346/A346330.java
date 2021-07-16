package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346330 Numbers that are the sum of eight fifth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A346330 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346330() {
    super(5, 8, 5, true, false);
  }
}
