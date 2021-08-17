package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;

/**
 * A050665 Primes p such that number of primes produced according to rules stipulated in Honaker's A048853 is 3.
 * @author Sean A. Irvine
 */
public class A050665 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050665() {
    super(new A050654());
  }
}
