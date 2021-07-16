package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346341 Numbers that are the sum of nine fifth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A346341 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346341() {
    super(5, 9, 6, true, false);
  }
}
