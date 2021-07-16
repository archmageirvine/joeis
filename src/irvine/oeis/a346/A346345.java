package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346345 Numbers that are the sum of nine fifth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A346345 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346345() {
    super(5, 9, 10, true, false);
  }
}
