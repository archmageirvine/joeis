package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345149 Numbers that are the sum of four third powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345149 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345149() {
    super(3, 4, 6, true, false);
  }
}
