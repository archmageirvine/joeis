package irvine.oeis.a004;

import irvine.oeis.SumOfLikePowersSequence;

/**
 * A004827 Numbers that are the sum of at most 5 positive cubes.
 * @author Sean A. Irvine
 */
public class A004827 extends SumOfLikePowersSequence {

  /** Construct the sequence. */
  public A004827() {
    super(3, 0, 5, false);
  }
}
