package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345848 Numbers that are the sum of nine fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345848 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345848() {
    super(4, 9, 6, true, false);
  }
}
