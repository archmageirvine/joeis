package irvine.oeis.a346;

import irvine.oeis.DirectSumOfLikePowersSequence;

/**
 * A346803 Numbers that are the sum of nine squares in ten or more ways.
 * @author Sean A. Irvine
 */
public class A346803 extends DirectSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346803() {
    super(2, 9, 10);
  }
}
