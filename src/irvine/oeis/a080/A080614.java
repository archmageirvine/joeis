package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080614 Consider a 3 X 3 X 3 Rubik's Cube, but allow only the moves T2, D2, F2; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080614 extends FiniteSequence {

  /** Construct the sequence. */
  public A080614() {
    super(1, 3, 5, 8, 13, 21, 23, 13, 5, 3, 1);
  }
}
