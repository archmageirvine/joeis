package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345085 Numbers that are the sum of three third powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345085 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345085() {
    super(3, 3, 7, true, false);
  }
}
