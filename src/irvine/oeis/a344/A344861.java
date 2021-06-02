package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344861 Numbers that are the sum of three fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A344861 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344861() {
    super(4, 3, 10, true, false);
  }
}
