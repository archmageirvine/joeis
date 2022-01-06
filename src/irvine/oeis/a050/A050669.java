package irvine.oeis.a050;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050669 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 7.
 * @author Sean A. Irvine
 */
public class A050669 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050669() {
    super(new A050658());
  }
}
