package irvine.oeis.a138;

import irvine.oeis.FiniteSequence;

/**
 * A138824 Divisors of 4064 (the 4th perfect number divided by 2), written in base 2.
 * @author Georg Fischer
 */
public class A138824 extends FiniteSequence {

  /** Construct the sequence. */
  public A138824() {
    super(1, 10, 100, 1000, 10000, 100000, 1111111, 11111110, 111111100L, 1111111000L, 11111110000L, 111111100000L);
  }
}
