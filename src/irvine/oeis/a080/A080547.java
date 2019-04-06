package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080547 Number of positions that are exactly n moves from the starting position in the Luminations Level 1 puzzle.
 * @author Georg Fischer
 */
public class A080547 extends FiniteSequence {

  /** Construct the sequence. */
  public A080547() {
    super(1, 1, 2, 5, 7, 12, 16, 24, 29, 33, 30, 27, 19, 11, 4, 2, 1);
  }
}
