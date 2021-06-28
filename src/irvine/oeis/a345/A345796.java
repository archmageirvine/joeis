package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345796 Numbers that are the sum of nine cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345796 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345796() {
    super(3, 9, 4, true, false);
  }
}
