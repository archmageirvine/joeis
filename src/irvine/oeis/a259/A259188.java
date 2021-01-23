package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259188 Primes p such that p, p^2 and p^3 are distinct-digit numbers.
 * @author Georg Fischer
 */
public class A259188 extends FiniteSequence {

  /** Construct the sequence. */
  public A259188() {
    super(2, 3, 5, 13, 17, 19, 29, 59, 73);
  }
}
