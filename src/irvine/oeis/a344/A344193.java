package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344193 Numbers that are the sum of four fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A344193 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344193() {
    super(4, 4, 2, true, false);
  }
}
