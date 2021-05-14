package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344189 Numbers that are the sum of four fourth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344189 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344189() {
    super(4, 4, 1, true, false);
  }
}
