package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345857 Numbers that are the sum of ten fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345857 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345857() {
    super(4, 10, 5, true, false);
  }
}
