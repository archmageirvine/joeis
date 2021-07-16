package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346347 Numbers that are the sum of ten fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A346347 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346347() {
    super(5, 10, 2, true, false);
  }
}
