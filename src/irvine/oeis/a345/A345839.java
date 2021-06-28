package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345839 Numbers that are the sum of eight fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345839 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345839() {
    super(4, 8, 7, true, false);
  }
}
