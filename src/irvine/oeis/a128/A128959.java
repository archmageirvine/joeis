package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128959 a(n) is equal to the number of positive integers m less than or equal to 10^n such that m is not divisible by at least one of the primes 2,3 and is not divisible by at least one of the primes 5,7.
 * @author Sean A. Irvine
 */
public class A128959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128959() {
    super(new long[] {-10, 11, -11, 11, -11, 11}, new long[] {82, 810, 8096, 80953, 809524, 8095239});
  }
}
