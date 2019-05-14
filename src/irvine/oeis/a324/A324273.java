package irvine.oeis.a324;

import irvine.oeis.FiniteSequence;

/**
 * A324273 Squares visited by a single pawn move for an even square and a double pawn move for an odd square on a diagonally numbered board and moving to the lowest available unvisited square of different parity at each step.
 * @author Georg Fischer
 */
public class A324273 extends FiniteSequence {

  /** Construct the sequence. */
  public A324273() {
    super(1, 4, 7, 2, 5, 12, 17, 8, 13, 6, 3, 10, 15, 26, 19, 32, 25, 14, 9, 18);
  }
}
