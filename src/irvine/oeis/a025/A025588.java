package irvine.oeis.a025;

import irvine.oeis.FiniteSequence;

/**
 * A025588 Number of <code>n-move self-avoiding</code> knight paths on <code>4 X 4</code> board, beginning at corner.
 * @author Georg Fischer
 */
public class A025588 extends FiniteSequence {

  /** Construct the sequence. */
  public A025588() {
    super(1, 2, 6, 10, 20, 48, 72, 144, 200, 328, 368, 448, 336, 192, 48, 0);
  }
}
