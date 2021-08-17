package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050668 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 6.
 * @author Sean A. Irvine
 */
public class A050668 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050668() {
    super(new A050657());
  }
}
