package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345852 Numbers that are the sum of nine fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345852 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345852() {
    super(4, 9, 10, true, false);
  }
}
