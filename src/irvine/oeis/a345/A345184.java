package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345184 Numbers that are the sum of five third powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345184 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345184() {
    super(3, 5, 8, true, false);
  }
}
