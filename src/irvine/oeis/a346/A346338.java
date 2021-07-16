package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346338 Numbers that are the sum of nine fifth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A346338 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346338() {
    super(5, 9, 3, true, false);
  }
}
