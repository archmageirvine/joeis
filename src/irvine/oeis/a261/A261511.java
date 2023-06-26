package irvine.oeis.a261;

import irvine.oeis.FiniteSequence;

/**
 * A261511 Twin primes with both terms having distinct digits in descending order.
 * @author Georg Fischer
 */
public class A261511 extends FiniteSequence {

  /** Construct the sequence. */
  public A261511() {
    super(1, FINITE, 3, 5, 7, 41, 43, 71, 73, 641, 643, 76541, 76543, 87641, 87643);
  }
}
