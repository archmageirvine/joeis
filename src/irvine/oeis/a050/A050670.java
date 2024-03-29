package irvine.oeis.a050;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050670 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 8.
 * @author Sean A. Irvine
 */
public class A050670 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050670() {
    super(new A050659());
  }
}
