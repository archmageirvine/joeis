package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259188 Primes p such that p, <code>p^2</code> and <code>p^3</code> are distinct-digit numbers.
 * @author Georg Fischer
 */
public class A259188 extends FiniteSequence {

  /** Construct the sequence. */
  public A259188() {
    super(2, 3, 5, 13, 17, 19, 29, 59, 73);
  }
}
