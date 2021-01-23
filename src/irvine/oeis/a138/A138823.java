package irvine.oeis.a138;

import irvine.oeis.FiniteSequence;

/**
 * A138823 Divisors of 248 (the 3rd perfect number divided by 2), written in base 2.
 * @author Georg Fischer
 */
public class A138823 extends FiniteSequence {

  /** Construct the sequence. */
  public A138823() {
    super(1, 10, 100, 1000, 11111, 111110, 1111100, 11111000);
  }
}
