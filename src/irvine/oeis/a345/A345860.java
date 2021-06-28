package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345860 Numbers that are the sum of ten fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345860 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345860() {
    super(4, 10, 8, true, false);
  }
}
