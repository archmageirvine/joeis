package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133024 Divisors of 8128, the 4th perfect number.
 * @author Georg Fischer
 */
public class A133024 extends FiniteSequence {

  /** Construct the sequence. */
  public A133024() {
    super(1, FINITE, 1, 2, 4, 8, 16, 32, 64, 127, 254, 508, 1016, 2032, 4064, 8128);
  }
}
