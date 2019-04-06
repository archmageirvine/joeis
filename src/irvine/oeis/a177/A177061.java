package irvine.oeis.a177;

import irvine.oeis.FiniteSequence;

/**
 * A177061 Primes p formed from single-digit primes only, each used at most once.
 * @author Georg Fischer
 */
public class A177061 extends FiniteSequence {

  /** Construct the sequence. */
  public A177061() {
    super(2, 3, 5, 7, 23, 37, 53, 73, 257, 523, 2357, 2753, 3257, 3527, 5237, 7253, 7523);
  }
}
