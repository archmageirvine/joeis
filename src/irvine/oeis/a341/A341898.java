package irvine.oeis.a341;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A341898 Numbers that are the sum of five fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A341898 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A341898() {
    super(4, 5, 10, true, false);
  }
}
