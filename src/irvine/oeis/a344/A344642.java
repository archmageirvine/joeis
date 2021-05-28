package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344642 Numbers that are the sum of four fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344642 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344642() {
    super(5, 4, 1, true, false);
  }
}
