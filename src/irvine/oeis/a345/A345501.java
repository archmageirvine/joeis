package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345501 Numbers that are the sum of nine squares in four or more ways.
 * @author Sean A. Irvine
 */
public class A345501 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345501() {
    super(2, 9, 4);
  }
}
