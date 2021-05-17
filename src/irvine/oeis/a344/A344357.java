package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344357 Numbers that are the sum of four fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A344357 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344357() {
    super(4, 4, 5, true, false);
  }
}
