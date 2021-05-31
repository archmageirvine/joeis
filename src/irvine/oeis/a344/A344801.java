package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344801 Numbers that are the sum of five squares in eight or more ways.
 * @author Sean A. Irvine
 */
public class A344801 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344801() {
    super(2, 5, 8);
  }
}
