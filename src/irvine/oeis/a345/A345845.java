package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345845 Numbers that are the sum of nine fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345845 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345845() {
    super(4, 9, 3, true, false);
  }
}
