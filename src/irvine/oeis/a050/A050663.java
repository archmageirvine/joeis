package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050663 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 1.
 * @author Sean A. Irvine
 */
public class A050663 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050663() {
    super(new A050652());
  }
}
