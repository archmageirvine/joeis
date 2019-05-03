package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008764 Number of <code>3 X 3</code> symmetric stochastic matrices under row and column permutations.
 * @author Sean A. Irvine
 */
public class A008764 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008764() {
    super(new long[] {1, 0, 0, 1}, new int[] {1, 2, 3, 4});
  }
}

