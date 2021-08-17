package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050667 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 5.
 * @author Sean A. Irvine
 */
public class A050667 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050667() {
    super(new A050656());
  }
}
