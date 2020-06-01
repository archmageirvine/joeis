package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080616 Consider <code>3 X 3 X 3</code> Rubik cube, but only allow the moves <code>T2, F2, R2;</code> sequence gives number of positions that are exactly n moves from the start.
 * @author Georg Fischer
 */
public class A080616 extends FiniteSequence {

  /** Construct the sequence. */
  public A080616() {
    super(1, 3, 6, 12, 24, 48, 93, 180, 315, 489, 604, 522, 250, 42, 3);
  }
}
