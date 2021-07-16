package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346364 Numbers that are the sum of six fifth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A346364 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346364() {
    super(5, 6, 9, true, false);
  }
}
