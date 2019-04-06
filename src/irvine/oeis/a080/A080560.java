package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080560 Number of positions that are exactly n moves from the starting position in the Orbix Type 1 puzzle.
 * @author Georg Fischer
 */
public class A080560 extends FiniteSequence {

  /** Construct the sequence. */
  public A080560() {
    super(1, 1, 3, 5, 12, 14, 24, 14, 12, 5, 3, 1, 1);
  }
}
