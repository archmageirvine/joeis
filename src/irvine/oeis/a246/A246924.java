package irvine.oeis.a246;

import irvine.oeis.FiniteSequence;

/**
 * A246924 8 X 8 square array read by rows: T(i,j) = number of moves of a knight to reach the square (i,j) when starting from the square (1,2).
 * @author Georg Fischer
 */
public class A246924 extends FiniteSequence {

  /** Construct the sequence. */
  public A246924() {
    super(1, FINITE, 3, 0, 3, 2, 3, 2, 3, 4, 2, 3, 2, 1, 2, 3, 4, 3, 1, 2, 1, 4, 3, 2, 3, 4, 2, 3, 2, 3, 2, 3, 4, 3, 3, 2, 3, 2, 3, 4, 3, 4, 4, 3, 4, 3, 4, 3, 4, 5, 3, 4, 3, 4, 3, 4, 5, 4, 4, 5, 4, 5, 4, 5, 4, 5);
  }
}
