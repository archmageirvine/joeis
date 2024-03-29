package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344862 Numbers that are the sum of three fourth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A344862 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344862() {
    super(4, 3, 10);
  }
}
