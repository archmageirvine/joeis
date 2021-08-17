package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050671 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 9.
 * @author Sean A. Irvine
 */
public class A050671 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050671() {
    super(new A050660());
  }
}
