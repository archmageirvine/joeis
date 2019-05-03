package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256493 Number of factorizations of <code>m^3</code> into at most 3 factors, where m is a product of exactly n distinct primes.
 * @author Sean A. Irvine
 */
public class A256493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256493() {
    super(new long[] {20, -32, 13}, new long[] {1, 3, 19});
  }
}
