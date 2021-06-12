package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345188 Numbers that are the sum of five third powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345188 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345188() {
    super(3, 5, 10, true, false);
  }
}
