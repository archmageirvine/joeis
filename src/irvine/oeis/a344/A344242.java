package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344242 Numbers that are the sum of four fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A344242 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344242() {
    super(4, 4, 3, true, false);
  }
}
