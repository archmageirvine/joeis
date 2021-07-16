package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346353 Numbers that are the sum of ten fifth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A346353 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346353() {
    super(5, 10, 8, true, false);
  }
}
