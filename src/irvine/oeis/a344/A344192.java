package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344192 Numbers that are the sum of three fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A344192 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344192() {
    super(4, 3, 2, true, false);
  }
}
