package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345155 Numbers that are the sum of four third powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345155 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345155() {
    super(3, 4, 10);
  }
}
