package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277240 Number of factorizations of m^n into exactly four factors, where m is a product of two distinct primes.
 * @author Sean A. Irvine
 */
public class A277240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277240() {
    super(new long[] {1, -2, -1, 2, 2, 2, -5, -2, 0, 2, 5, -2, -2, -2, 1, 2}, new long[] {1, 2, 9, 27, 74, 168, 363, 703, 1297, 2247, 3742, 5967, 9241, 13859, 20307, 29052});
  }
}
