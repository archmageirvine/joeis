package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345088 Numbers that are the sum of three third powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345088 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345088() {
    super(3, 3, 8, true, false);
  }
}
