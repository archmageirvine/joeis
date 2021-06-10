package irvine.oeis.a341;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A341891 Numbers that are the sum of five fourth powers in nine or more ways.
 * @author Sean A. Irvine
 */
public class A341891 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A341891() {
    super(4, 5, 9);
  }
}
