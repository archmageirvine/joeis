package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345844 Numbers that are the sum of nine fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345844 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345844() {
    super(4, 9, 2, true, false);
  }
}
