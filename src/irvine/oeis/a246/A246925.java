package irvine.oeis.a246;

import irvine.oeis.FiniteSequence;

/**
 * A246925 8 X 8 square array read by rows: <code>T(i,j) =</code> number of moves of a knight to reach the square <code>(i,j)</code> when starting from the corner square <code>(1,1)</code>.
 * @author Georg Fischer
 */
public class A246925 extends FiniteSequence {

  /** Construct the sequence. */
  public A246925() {
    super(0, 3, 2, 3, 2, 3, 4, 5, 3, 4, 1, 2, 3, 4, 3, 4, 2, 1, 4, 3, 2, 3, 4, 5, 3, 2, 3, 2, 3, 4, 3, 4, 2, 3, 2, 3, 4, 3, 4, 5, 3, 4, 3, 4, 3, 4, 5, 4, 4, 3, 4, 3, 4, 5, 4, 5, 5, 4, 5, 4, 5, 4, 5, 6);
  }
}
