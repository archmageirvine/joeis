package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345503 Numbers that are the sum of nine squares in six or more ways.
 * @author Sean A. Irvine
 */
public class A345503 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345503() {
    super(2, 9, 6);
  }
}
