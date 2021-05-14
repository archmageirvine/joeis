package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344187 Numbers that are the sum of two positive fourth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344187 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344187() {
    super(4, 2, 1, true, false);
  }
}
