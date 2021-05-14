package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344035 Numbers that are the sum of five positive cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A344035 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344035() {
    super(3, 5, 4, true, false);
  }
}
