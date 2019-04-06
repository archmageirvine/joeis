package irvine.oeis.a087;

import irvine.oeis.FiniteSequence;

/**
 * A087092 Descending squares: which squares can be packed with at least 2 squares so that every square directly above a square is strictly smaller? It is conjectured that the answer is all except those in this sequence.
 * @author Georg Fischer
 */
public class A087092 extends FiniteSequence {

  /** Construct the sequence. */
  public A087092() {
    super(1, 2, 3, 4, 5, 7, 8, 9, 11, 13, 15, 17, 19, 23, 33);
  }
}
