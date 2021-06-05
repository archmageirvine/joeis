package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344929 Numbers that are the sum of four fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A344929 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344929() {
    super(4, 4, 10, true, false);
  }
}
