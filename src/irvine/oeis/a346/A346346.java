package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346346 Numbers that are the sum of ten fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A346346 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346346() {
    super(5, 10, 1, true, false);
  }
}
