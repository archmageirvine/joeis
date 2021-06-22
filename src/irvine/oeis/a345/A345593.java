package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345593 Numbers that are the sum of nine fourth powers in nine or more ways.
 * @author Sean A. Irvine
 */
public class A345593 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345593() {
    super(4, 9, 9);
  }
}
