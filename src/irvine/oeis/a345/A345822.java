package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345822 Numbers that are the sum of six fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345822 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345822() {
    super(4, 6, 10, true, false);
  }
}
