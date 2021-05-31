package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344803 Numbers that are the sum of five squares in ten or more ways.
 * @author Sean A. Irvine
 */
public class A344803 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344803() {
    super(2, 5, 10);
  }
}
