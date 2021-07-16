package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346343 Numbers that are the sum of nine fifth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A346343 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346343() {
    super(5, 9, 8, true, false);
  }
}
