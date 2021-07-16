package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346336 Numbers that are the sum of nine fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A346336 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346336() {
    super(5, 9, 1, true, false);
  }
}
