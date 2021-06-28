package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345840 Numbers that are the sum of eight fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345840 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345840() {
    super(4, 8, 8, true, false);
  }
}
