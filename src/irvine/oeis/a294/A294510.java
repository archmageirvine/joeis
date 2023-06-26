package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294510 Residues modulo 24 of curvatures in the Apollonian circle packing A042944.
 * @author Georg Fischer
 */
public class A294510 extends FiniteSequence {

  /** Construct the sequence. */
  public A294510() {
    super(1, FINITE, 2, 3, 6, 11, 14, 15, 18, 23);
  }
}
