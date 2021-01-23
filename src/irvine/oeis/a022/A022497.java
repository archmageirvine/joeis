package irvine.oeis.a022;

import irvine.oeis.CoordinationSequence;

/**
 * A022497 Conjectured number of irreducible multiple zeta values of depth 9 and weight 2n+25.
 * @author Sean A. Irvine
 */
public class A022497 extends CoordinationSequence {

  /** Construct the sequence. */
  public A022497() {
    super(new long[] {2, 3, 6, 5, 5, 8, 7, 3, 6, 5, 0, 0, 3, 0, -3, -2, 2, 2, -1}, new int[] {1, 1, 2, 2, 2, 3, 3, 6, 9});
  }
}
