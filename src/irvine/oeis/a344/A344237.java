package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344237 Numbers that are the sum of five fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A344237 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344237() {
    super(4, 5, 2, true, false);
  }
}
