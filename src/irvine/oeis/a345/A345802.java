package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345802 Numbers that are the sum of nine cubes in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345802 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345802() {
    super(3, 9, 10, true, false);
  }
}
