package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344927 Numbers that are the sum of four fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A344927 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344927() {
    super(4, 4, 9, true, false);
  }
}
