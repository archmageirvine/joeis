package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345770 Numbers that are the sum of six cubes in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345770 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345770() {
    super(3, 6, 8, true, false);
  }
}
