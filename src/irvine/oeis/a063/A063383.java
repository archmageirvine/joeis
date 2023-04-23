package irvine.oeis.a063;

import irvine.oeis.a062.A062095;

/**
 * A063383 a(1) = 6, a(n) = concatenation of two closest divisors of a(n-1) whose product equals a(n-1) or if a(n-1) is a prime then the concatenation of 1 and a(n-1).
 * @author Sean A. Irvine
 */
public class A063383 extends A062095 {

  /** Construct the sequence. */
  public A063383() {
    super(6);
  }
}
