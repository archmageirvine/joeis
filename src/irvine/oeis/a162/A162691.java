package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162691 Strictly positive numbers k such that 24*k/(24+k) is an integer.
 * @author Georg Fischer
 */
public class A162691 extends FiniteSequence {

  /** Construct the sequence. */
  public A162691() {
    super(1, FINITE, 8, 12, 24, 40, 48, 72, 120, 168, 264, 552);
  }
}
