package irvine.oeis.a004;

import irvine.oeis.SumOfLikePowersSequence;

/**
 * A004830 Numbers that are the sum of at most 8 positive cubes.
 * @author Sean A. Irvine
 */
public class A004830 extends SumOfLikePowersSequence {

  /** Construct the sequence. */
  public A004830() {
    super(3, 0, 8, false);
  }
}
