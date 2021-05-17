package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344359 Numbers that are the sum of five fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A344359 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344359() {
    super(4, 5, 5, true, false);
  }
}
