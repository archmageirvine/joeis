package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178183 a(n) = number of 3-digit primes with digit sum n, where n runs through the non-multiples of 3 in the range [2..26].
 * @author Georg Fischer
 */
public class A178183 extends FiniteSequence {

  /** Construct the sequence. */
  public A178183() {
    super(1, FINITE, 1, 2, 4, 7, 7, 12, 13, 16, 16, 13, 18, 12, 11, 6, 4, 1, 0);
  }
}
