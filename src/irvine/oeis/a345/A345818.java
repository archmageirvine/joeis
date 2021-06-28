package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345818 Numbers that are the sum of six fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345818 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345818() {
    super(4, 6, 6, true, false);
  }
}
