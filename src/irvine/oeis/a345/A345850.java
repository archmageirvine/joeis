package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345850 Numbers that are the sum of nine fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345850 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345850() {
    super(4, 9, 8, true, false);
  }
}
