package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346354 Numbers that are the sum of ten fifth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A346354 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346354() {
    super(5, 10, 9, true, false);
  }
}
