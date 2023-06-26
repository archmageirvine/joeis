package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129844 Triangular sequence constructed from heights of irreducible representations of semi-simple Lie algebras (exceptional groups plus A1, G2, F4, E6, E7, E8).
 * @author Georg Fischer
 */
public class A129844 extends FiniteSequence {

  /** Construct the sequence. */
  public A129844() {
    super(1, FINITE, 1, 6, 10, 16, 22, 30, 42, 16, 16, 22, 30, 30, 42, 27, 34, 49, 52, 66, 75, 96, 58, 92, 114, 136, 168, 192, 220, 270);
  }
}
