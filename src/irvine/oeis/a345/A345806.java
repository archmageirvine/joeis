package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345806 Numbers that are the sum of ten cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345806 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345806() {
    super(3, 10, 4, true, false);
  }
}
