package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344365 Numbers that are the sum of three fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A344365 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344365() {
    super(4, 3, 5, true, false);
  }
}
