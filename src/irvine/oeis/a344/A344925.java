package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344925 Numbers that are the sum of four fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A344925 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344925() {
    super(4, 4, 8, true, false);
  }
}
