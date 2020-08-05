package irvine.oeis.a004;

import irvine.oeis.SumOfLikePowersSequence;

/**
 * A004826 Numbers that are the sum of at most 4 positive cubes.
 * @author Sean A. Irvine
 */
public class A004826 extends SumOfLikePowersSequence {

  /** Construct the sequence. */
  public A004826() {
    super(3, 0, 4, false);
  }
}
