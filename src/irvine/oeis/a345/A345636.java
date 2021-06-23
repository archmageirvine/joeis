package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345636 Numbers that are the sum of ten fifth powers in four or more ways.
 * @author Sean A. Irvine
 */
public class A345636 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345636() {
    super(5, 10, 4);
  }
}
