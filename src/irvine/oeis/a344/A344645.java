package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344645 Numbers that are the sum of four fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A344645 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344645() {
    super(5, 4, 2, true, false);
  }
}
