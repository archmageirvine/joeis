package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344921 Numbers that are the sum of four fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A344921 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344921() {
    super(4, 4, 6, true, false);
  }
}
