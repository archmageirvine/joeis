package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345832 Numbers that are the sum of seven fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345832 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345832() {
    super(4, 7, 10, true, false);
  }
}
