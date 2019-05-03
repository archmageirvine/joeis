package irvine.oeis.a135;

import irvine.oeis.FiniteSequence;

/**
 * A135653 Divisors of <code>496 (the 3rd</code> perfect number), written in base 2.
 * @author Georg Fischer
 */
public class A135653 extends FiniteSequence {

  /** Construct the sequence. */
  public A135653() {
    super(1, 10, 100, 1000, 10000, 11111, 111110, 1111100, 11111000, 111110000L);
  }
}
