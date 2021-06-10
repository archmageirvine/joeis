package irvine.oeis.a341;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A341892 Numbers that are the sum of five fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A341892 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A341892() {
    super(4, 5, 9, true, false);
  }
}
