package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345846 Numbers that are the sum of nine fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345846 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345846() {
    super(4, 9, 4, true, false);
  }
}
