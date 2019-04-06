package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080561 Number of positions that are exactly n moves from the starting position in the Orbix Type 1 puzzle.
 * @author Georg Fischer
 */
public class A080561 extends FiniteSequence {

  /** Construct the sequence. */
  public A080561() {
    super(1, 1, 3, 5, 10, 12, 18, 12, 10, 5, 3, 1, 1);
  }
}
