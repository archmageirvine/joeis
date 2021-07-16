package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346344 Numbers that are the sum of nine fifth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A346344 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346344() {
    super(5, 9, 9, true, false);
  }
}
