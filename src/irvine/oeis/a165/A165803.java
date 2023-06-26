package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165803 Integers n such that the trajectory of n under repeated applications of the map k-&gt;(k-3)/2 is a chain of primes that reaches 2 or 3 (n itself need not be a prime).
 * @author Georg Fischer
 */
public class A165803 extends FiniteSequence {

  /** Construct the sequence. */
  public A165803() {
    super(1, FINITE, 2, 3, 7, 9, 17, 37, 77);
  }
}
