package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346334 Numbers that are the sum of eight fifth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A346334 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346334() {
    super(5, 8, 9, true, false);
  }
}
