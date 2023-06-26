package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173105 The 15 supersingular primes written in octal.
 * @author Georg Fischer
 */
public class A173105 extends FiniteSequence {

  /** Construct the sequence. */
  public A173105() {
    super(1, FINITE, 2, 3, 5, 7, 13, 15, 21, 23, 27, 35, 37, 51, 57, 73, 107);
  }
}
