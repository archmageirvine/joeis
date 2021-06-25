package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345627 Numbers that are the sum of nine fifth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345627 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345627() {
    super(5, 9, 10);
  }
}
