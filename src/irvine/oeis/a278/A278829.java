package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278829 Pawn&apos;s moves in chess: possible difference between origin and destination square when the squares are numbered sequentially row by row.
 * @author Georg Fischer
 */
public class A278829 extends FiniteSequence {

  /** Construct the sequence. */
  public A278829() {
    super(-16, -9, -8, -7, 7, 8, 9, 16);
  }
}
