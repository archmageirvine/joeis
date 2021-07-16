package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346351 Numbers that are the sum of ten fifth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A346351 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346351() {
    super(5, 10, 6, true, false);
  }
}
