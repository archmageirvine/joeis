package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345624 Numbers that are the sum of nine fifth powers in seven or more ways.
 * @author Sean A. Irvine
 */
public class A345624 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345624() {
    super(5, 9, 7);
  }
}
