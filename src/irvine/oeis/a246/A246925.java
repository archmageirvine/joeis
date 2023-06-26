package irvine.oeis.a246;

import irvine.oeis.FiniteSequence;

/**
 * A246925 8 X 8 square array read by rows: T(i,j) = number of moves of a knight to reach the square (i,j) when starting from the corner square (1,1).
 * @author Georg Fischer
 */
public class A246925 extends FiniteSequence {

  /** Construct the sequence. */
  public A246925() {
    super(1, FINITE, 0, 3, 2, 3, 2, 3, 4, 5, 3, 4, 1, 2, 3, 4, 3, 4, 2, 1, 4, 3, 2, 3, 4, 5, 3, 2, 3, 2, 3, 4, 3, 4, 2, 3, 2, 3, 4, 3, 4, 5, 3, 4, 3, 4, 3, 4, 5, 4, 4, 3, 4, 3, 4, 5, 4, 5, 5, 4, 5, 4, 5, 4, 5, 6);
  }
}
