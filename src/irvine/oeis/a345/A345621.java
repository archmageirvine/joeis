package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345621 Numbers that are the sum of nine fifth powers in four or more ways.
 * @author Sean A. Irvine
 */
public class A345621 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345621() {
    super(5, 9, 4);
  }
}
