package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345766 Numbers that are the sum of six cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345766 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345766() {
    super(3, 6, 4, true, false);
  }
}
