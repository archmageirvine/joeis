package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345776 Numbers that are the sum of seven cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345776 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345776() {
    super(3, 7, 4, true, false);
  }
}
