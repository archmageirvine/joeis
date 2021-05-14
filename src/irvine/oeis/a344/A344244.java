package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344244 Numbers that are the sum of five fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A344244 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344244() {
    super(4, 5, 3, true, false);
  }
}
