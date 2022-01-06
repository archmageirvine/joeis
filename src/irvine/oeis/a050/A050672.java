package irvine.oeis.a050;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050672 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 10.
 * @author Sean A. Irvine
 */
public class A050672 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050672() {
    super(new A050661());
  }
}
