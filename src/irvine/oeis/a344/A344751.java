package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344751 Numbers that are the sum of three fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A344751 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344751() {
    super(4, 3, 9, true, false);
  }
}
