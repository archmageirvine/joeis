package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344804 Numbers that are the sum of two cubes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A344804 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344804() {
    super(3, 2, 3, true, false);
  }
}
