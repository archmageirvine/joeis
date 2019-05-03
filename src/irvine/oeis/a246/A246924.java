package irvine.oeis.a246;

import irvine.oeis.FiniteSequence;

/**
 * A246924 <code>8 X 8</code> square array read by rows: <code>T(i,j) =</code> number of moves of a knight to reach the square <code>(i,j)</code> when starting from the square <code>(1,2)</code>.
 * @author Georg Fischer
 */
public class A246924 extends FiniteSequence {

  /** Construct the sequence. */
  public A246924() {
    super(3, 0, 3, 2, 3, 2, 3, 4, 2, 3, 2, 1, 2, 3, 4, 3, 1, 2, 1, 4, 3, 2, 3, 4, 2, 3, 2, 3, 2, 3, 4, 3, 3, 2, 3, 2, 3, 4, 3, 4, 4, 3, 4, 3, 4, 3, 4, 5, 3, 4, 3, 4, 3, 4, 5, 4, 4, 5, 4, 5, 4, 5, 4, 5);
  }
}
