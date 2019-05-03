package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080614 Consider a <code>3 X 3 X 3</code> Rubik's Cube, but allow only the moves <code>T2, D2, F2</code>; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080614 extends FiniteSequence {

  /** Construct the sequence. */
  public A080614() {
    super(1, 3, 5, 8, 13, 21, 23, 13, 5, 3, 1);
  }
}
