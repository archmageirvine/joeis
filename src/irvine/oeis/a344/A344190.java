package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344190 Numbers that are the sum of five fourth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344190 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344190() {
    super(4, 5, 1, true, false);
  }
}
