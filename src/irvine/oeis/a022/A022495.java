package irvine.oeis.a022;

import irvine.oeis.CoordinationSequence;

/**
 * A022495 Conjectured number of irreducible multiple zeta values of depth 7 and weight <code>2n+19</code>.
 * @author Sean A. Irvine
 */
public class A022495 extends CoordinationSequence {

  /** Construct the sequence. */
  public A022495() {
    super(new long[] {1, 4, 8, 8, 6, 4, 5, 6, 3, -2, -3, -1, 1, 1}, new int[] {2, 2, 2, 3, 3, 3, 7});
  }
}
