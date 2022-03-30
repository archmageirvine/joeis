package irvine.oeis.a055;

import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A055632 Sum of totient function of primes dividing n is a prime.
 * @author Sean A. Irvine
 */
public class A055632 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A055632() {
    super(new A055631(), 1);
  }
}
