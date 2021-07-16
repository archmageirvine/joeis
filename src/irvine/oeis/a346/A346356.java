package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346356 Numbers that are the sum of six fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A346356 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346356() {
    super(5, 6, 1, true, false);
  }
}
