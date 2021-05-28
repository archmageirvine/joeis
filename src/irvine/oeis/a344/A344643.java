package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344643 Numbers that are the sum of five fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344643 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344643() {
    super(5, 5, 1, true, false);
  }
}
