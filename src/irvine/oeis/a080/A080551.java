package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080551 Number of positions that are exactly n moves from the starting position in the Luminations Level 2 puzzle.
 * @author Georg Fischer
 */
public class A080551 extends FiniteSequence {

  /** Construct the sequence. */
  public A080551() {
    super(1, 1, 2, 5, 10, 15, 22, 24, 26, 22, 19, 12, 9, 4, 3);
  }
}
