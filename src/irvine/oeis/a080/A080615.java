package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080615 Consider <code>3 X 3 X 3</code> Rubik cube, but only allow the moves <code>T2, D2, F2, B2</code>; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080615 extends FiniteSequence {

  /** Construct the sequence. */
  public A080615() {
    super(1, 4, 10, 24, 53, 64, 31, 4, 1);
  }
}
