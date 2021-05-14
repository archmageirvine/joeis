package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344188 Numbers that are the sum of three fourth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344188 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344188() {
    super(4, 3, 1, true, false);
  }
}
