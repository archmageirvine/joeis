package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345843 Numbers that are the sum of nine fourth powers in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345843 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345843() {
    super(4, 9, 1, true, false);
  }
}
