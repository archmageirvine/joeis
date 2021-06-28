package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345847 Numbers that are the sum of nine fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345847 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345847() {
    super(4, 9, 5, true, false);
  }
}
