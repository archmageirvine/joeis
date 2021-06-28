package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345833 Numbers that are the sum of eight fourth powers in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345833 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345833() {
    super(4, 8, 1, true, false);
  }
}
