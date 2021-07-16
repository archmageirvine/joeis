package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346337 Numbers that are the sum of nine fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A346337 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346337() {
    super(5, 9, 2, true, false);
  }
}
