package irvine.oeis.a268;

import irvine.oeis.FiniteSequence;

/**
 * A268283 Number of distinct directed Hamiltonian cycles of the Platonic graphs (in the order of tetrahedral, cubical, octahedral, dodecahedral, and icosahedral graph).
 * @author Georg Fischer
 */
public class A268283 extends FiniteSequence {

  /** Construct the sequence. */
  public A268283() {
    super(1, FINITE, 6, 12, 32, 60, 2560);
  }
}
