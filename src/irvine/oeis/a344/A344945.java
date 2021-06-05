package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344945 Numbers that are the sum of five fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A344945 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344945() {
    super(4, 5, 8, true, false);
  }
}
