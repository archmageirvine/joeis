package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345625 Numbers that are the sum of nine fifth powers in eight or more ways.
 * @author Sean A. Irvine
 */
public class A345625 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345625() {
    super(5, 9, 8);
  }
}
