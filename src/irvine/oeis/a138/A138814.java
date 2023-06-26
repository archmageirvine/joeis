package irvine.oeis.a138;

import irvine.oeis.FiniteSequence;

/**
 * A138814 Divisors of 4064 (half the 4th perfect number).
 * @author Georg Fischer
 */
public class A138814 extends FiniteSequence {

  /** Construct the sequence. */
  public A138814() {
    super(1, FINITE, 1, 2, 4, 8, 16, 32, 127, 254, 508, 1016, 2032, 4064);
  }
}
