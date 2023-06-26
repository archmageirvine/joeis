package irvine.oeis.a303;

import irvine.oeis.FiniteSequence;

/**
 * A303704 Numbers k such that all coprime quadratic residues modulo k are squares.
 * @author Georg Fischer
 */
public class A303704 extends FiniteSequence {

  /** Construct the sequence. */
  public A303704() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 16, 20, 21, 24, 28, 40, 48, 56, 60, 72, 88, 120, 168, 240, 840);
  }
}
