package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345825 Numbers that are the sum of seven fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345825 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345825() {
    super(4, 7, 3, true, false);
  }
}
