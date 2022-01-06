package irvine.oeis.a053;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A053435 Primes with distinct digits in alphabetical order (in English).
 * @author Sean A. Irvine
 */
public class A053435 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A053435() {
    super(new A053433());
  }
}
