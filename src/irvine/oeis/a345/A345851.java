package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345851 Numbers that are the sum of nine fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345851 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345851() {
    super(4, 9, 9, true, false);
  }
}
