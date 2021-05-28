package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344648 Numbers that are the sum of three fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A344648 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344648() {
    super(4, 3, 6, true, false);
  }
}
