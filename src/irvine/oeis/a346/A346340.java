package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346340 Numbers that are the sum of nine fifth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A346340 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346340() {
    super(5, 9, 5, true, false);
  }
}
