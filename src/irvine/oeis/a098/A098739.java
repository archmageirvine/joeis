package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098739 This sequence is constructed using only the four single-digit primes 2,3,5,7 in that order.
 * @author Sean A. Irvine
 */
public class A098739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098739() {
    super(1, new long[] {-10, 1, 0, 0, 10}, new long[] {2, 23, 235, 2357, 23572});
  }
}
