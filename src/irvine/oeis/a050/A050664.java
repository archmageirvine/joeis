package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050664 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 2.
 * @author Sean A. Irvine
 */
public class A050664 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050664() {
    super(new A050653());
  }
}
