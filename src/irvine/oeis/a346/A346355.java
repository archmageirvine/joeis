package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346355 Numbers that are the sum of ten fifth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A346355 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346355() {
    super(5, 10, 10, true, false);
  }
}
