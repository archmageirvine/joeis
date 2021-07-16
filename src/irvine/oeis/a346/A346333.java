package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346333 Numbers that are the sum of eight fifth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A346333 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346333() {
    super(5, 8, 8, true, false);
  }
}
