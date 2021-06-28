package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345858 Numbers that are the sum of ten fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345858 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345858() {
    super(4, 10, 6, true, false);
  }
}
