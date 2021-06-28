package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345853 Numbers that are the sum of ten fourth powers in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345853 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345853() {
    super(4, 10, 1, true, false);
  }
}
