package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345862 Numbers that are the sum of ten fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345862 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345862() {
    super(4, 10, 10, true, false);
  }
}
