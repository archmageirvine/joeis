package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128959 <code>a(n)</code> is equal to the number of positive integers m less than or equal to <code>10^n</code> such that m is not divisible by at least one of the primes <code>2,3</code> and is not divisible by at least one of the primes <code>5,7</code>.
 * @author Sean A. Irvine
 */
public class A128959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128959() {
    super(new long[] {-10, 11, -11, 11, -11, 11}, new long[] {82, 810, 8096, 80953, 809524, 8095239});
  }
}
