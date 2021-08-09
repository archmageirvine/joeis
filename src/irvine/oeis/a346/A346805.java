package irvine.oeis.a346;

import irvine.oeis.DirectSumOfLikePowersSequence;

/**
 * A346805 Numbers that are the sum of ten squares in six or more ways.
 * @author Sean A. Irvine
 */
public class A346805 extends DirectSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346805() {
    super(2, 10, 6);
  }
}
