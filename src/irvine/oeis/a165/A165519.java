package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165519 Integers k for which k(k+1)(k+2) is a triangular number.
 * @author Georg Fischer
 */
public class A165519 extends FiniteSequence {

  /** Construct the sequence. */
  public A165519() {
    super(-2, -1, 0, 1, 4, 5, 9, 56, 636);
  }
}
