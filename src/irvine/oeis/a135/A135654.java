package irvine.oeis.a135;

import irvine.oeis.FiniteSequence;

/**
 * A135654 Divisors of 8128 (the 4th perfect number), written in base 2.
 * @author Georg Fischer
 */
public class A135654 extends FiniteSequence {

  /** Construct the sequence. */
  public A135654() {
    super(1, 10, 100, 1000, 10000, 100000, 1000000, 1111111, 11111110, 111111100L, 1111111000L, 11111110000L, 111111100000L, 1111111000000L);
  }
}
