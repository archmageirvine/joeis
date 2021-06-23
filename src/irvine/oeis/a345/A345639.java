package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345639 Numbers that are the sum of ten fifth powers in seven or more ways.
 * @author Sean A. Irvine
 */
public class A345639 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345639() {
    super(5, 10, 7);
  }
}
