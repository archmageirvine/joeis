package irvine.oeis.a323;

import irvine.oeis.FiniteSequence;

/**
 * A323387 Primes whose digits are distinct square digits, i.e., consisting of only digits 0, 1, 4, 9.
 * @author Georg Fischer
 */
public class A323387 extends FiniteSequence {

  /** Construct the sequence. */
  public A323387() {
    super(19, 41, 109, 149, 401, 409, 419, 491, 941, 1049, 1409, 4019, 4091, 9041);
  }
}
