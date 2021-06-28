package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345787 Numbers that are the sum of eight cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345787 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345787() {
    super(3, 8, 5, true, false);
  }
}
