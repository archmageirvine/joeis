package irvine.oeis.a341;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A341897 Numbers that are the sum of five fourth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A341897 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A341897() {
    super(4, 5, 10);
  }
}
