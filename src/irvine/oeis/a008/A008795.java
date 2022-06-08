package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008795 Molien series for 3-dimensional representation of dihedral group D_6 of order 6.
 * @author Sean A. Irvine
 */
public class A008795 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008795() {
    super(new long[] {1, 0, 0, 1}, new int[] {2, 2, 2});
  }
}

