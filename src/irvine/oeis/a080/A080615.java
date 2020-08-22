package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080615 Consider 3 X 3 X 3 Rubik cube, but only allow the moves T2, D2, F2, B2; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080615 extends FiniteSequence {

  /** Construct the sequence. */
  public A080615() {
    super(1, 4, 10, 24, 53, 64, 31, 4, 1);
  }
}
