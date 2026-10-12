package irvine.oeis.a394;

import irvine.oeis.FiniteSequence;

/**
 * A394658 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^2.
 * @author Sean A. Irvine
 */
public class A394658 extends FiniteSequence {

  /** Construct the sequence. */
  public A394658() {
    super(1, FINITE, 56, 135, 375, 686);
  }
}
