package irvine.oeis.a154;

import irvine.oeis.FiniteSequence;

/**
 * A154299 Primes of the form (1+...+m)/51 = A000217(m)/51.
 * @author Georg Fischer
 */
public class A154299 extends FiniteSequence {

  /** Construct the sequence. */
  public A154299() {
    super(1, FINITE, 3, 11, 101, 103);
  }
}
