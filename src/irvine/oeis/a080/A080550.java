package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080550 Number of positions that are exactly n moves from the starting position in the Luminations Level 2 puzzle.
 * @author Georg Fischer
 */
public class A080550 extends FiniteSequence {

  /** Construct the sequence. */
  public A080550() {
    super(1, 1, 3, 7, 15, 21, 30, 32, 34, 27, 23, 14, 10, 4, 3);
  }
}
