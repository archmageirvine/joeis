package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080548 Number of positions that are exactly n moves from the starting position in the Luminations Level 1 puzzle.
 * @author Georg Fischer
 */
public class A080548 extends FiniteSequence {

  /** Construct the sequence. */
  public A080548() {
    super(1, 1, 2, 4, 6, 9, 12, 17, 21, 24, 23, 21, 16, 10, 4, 2, 1);
  }
}
