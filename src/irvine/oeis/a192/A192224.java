package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192224 P-integers: n such that the first phi(n) primes coprime to n form a reduced residue system modulo n, where phi is Euler's totient function A000010.
 * @author Georg Fischer
 */
public class A192224 extends FiniteSequence {

  /** Construct the sequence. */
  public A192224() {
    super(1, FINITE, 2, 4, 6, 12, 18, 30);
  }
}
