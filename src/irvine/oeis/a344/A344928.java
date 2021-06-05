package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344928 Numbers that are the sum of four fourth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A344928 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344928() {
    super(4, 4, 10);
  }
}
