package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344941 Numbers that are the sum of five fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A344941 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344941() {
    super(4, 5, 6, true, false);
  }
}
