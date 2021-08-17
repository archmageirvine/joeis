package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050666 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 4.
 * @author Sean A. Irvine
 */
public class A050666 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050666() {
    super(new A050655());
  }
}
