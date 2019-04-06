package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080616 Consider 3 X 3 X 3 Rubik cube, but only allow the moves T2, F2, R2; sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080616 extends FiniteSequence {

  /** Construct the sequence. */
  public A080616() {
    super(1, 3, 6, 12, 24, 48, 93, 180, 315, 489, 604, 522, 250, 42, 3);
  }
}
