package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345837 Numbers that are the sum of eight fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345837 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345837() {
    super(4, 8, 5, true, false);
  }
}
