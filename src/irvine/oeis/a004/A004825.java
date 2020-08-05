package irvine.oeis.a004;

import irvine.oeis.SumOfLikePowersSequence;

/**
 * A004825 Numbers that are the sum of at most 3 positive cubes.
 * @author Sean A. Irvine
 */
public class A004825 extends SumOfLikePowersSequence {

  /** Construct the sequence. */
  public A004825() {
    super(3, 0, 3, false);
  }
}
