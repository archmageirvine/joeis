package irvine.oeis.a048;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A048465 Distinct primes in sorted order from generation 2 onwards.
 * @author Sean A. Irvine
 */
public class A048465 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A048465() {
    super(new A048462());
  }
}
