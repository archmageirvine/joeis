package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345642 Numbers that are the sum of ten fifth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345642 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345642() {
    super(5, 10, 10);
  }
}
