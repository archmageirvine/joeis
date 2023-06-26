package irvine.oeis.a124;

import irvine.oeis.FiniteSequence;

/**
 * A124674 Primes with distinct prime digits.
 * @author Georg Fischer
 */
public class A124674 extends FiniteSequence {

  /** Construct the sequence. */
  public A124674() {
    super(1, FINITE, 2, 3, 5, 7, 23, 37, 53, 73, 257, 523, 2357, 2753, 3257, 3527, 5237, 5273, 7253, 7523);
  }
}
