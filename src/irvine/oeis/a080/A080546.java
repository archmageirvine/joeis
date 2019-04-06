package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080546 Number of positions that are exactly n moves from the starting position in the Luminations Level 1 puzzle.
 * @author Georg Fischer
 */
public class A080546 extends FiniteSequence {

  /** Construct the sequence. */
  public A080546() {
    super(1, 3, 6, 13, 19, 34, 44, 70, 85, 95, 86, 77, 49, 27, 10, 4, 1);
  }
}
