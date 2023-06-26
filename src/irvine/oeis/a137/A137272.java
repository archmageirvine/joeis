package irvine.oeis.a137;

import irvine.oeis.FiniteSequence;

/**
 * A137272 Number of 1D random walks with 8 steps where the median of the positions is n.
 * @author Georg Fischer
 */
public class A137272 extends FiniteSequence {

  /** Construct the sequence. */
  public A137272() {
    super(-4, FINITE, 6, 10, 32, 45, 70, 45, 32, 10, 6);
  }
}
