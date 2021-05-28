package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344738 Numbers that are the sum of three fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A344738 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344738() {
    super(4, 3, 8, true, false);
  }
}
