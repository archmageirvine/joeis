package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344240 Numbers that are the sum of three fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A344240 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344240() {
    super(4, 3, 3, true, false);
  }
}
