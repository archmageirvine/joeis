package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345637 Numbers that are the sum of ten fifth powers in five or more ways.
 * @author Sean A. Irvine
 */
public class A345637 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345637() {
    super(5, 10, 5);
  }
}
