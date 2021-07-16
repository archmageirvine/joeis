package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346350 Numbers that are the sum of ten fifth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A346350 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346350() {
    super(5, 10, 5, true, false);
  }
}
