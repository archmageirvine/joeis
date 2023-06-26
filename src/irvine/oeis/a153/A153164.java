package irvine.oeis.a153;

import irvine.oeis.FiniteSequence;

/**
 * A153164 Primes p with property that p^2 is a concatenation of two 3-digit primes.
 * @author Georg Fischer
 */
public class A153164 extends FiniteSequence {

  /** Construct the sequence. */
  public A153164() {
    super(1, FINITE, 337, 409, 701, 827);
  }
}
