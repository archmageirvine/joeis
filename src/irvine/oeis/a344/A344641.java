package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344641 Numbers that are the sum of three fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A344641 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344641() {
    super(5, 3, 1, true, false);
  }
}
