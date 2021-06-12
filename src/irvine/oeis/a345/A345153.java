package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345153 Numbers that are the sum of four third powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345153 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345153() {
    super(3, 4, 8, true, false);
  }
}
