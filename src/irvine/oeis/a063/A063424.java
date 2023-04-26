package irvine.oeis.a063;

import irvine.oeis.a062.A062095;

/**
 * A063424 a(1) = 10, a(n) = concatenation of two closest factors of a(n-1) whose product equals a(n-1) or if a(n-1) is a prime then the concatenation of 1 and a(n-1).
 * @author Sean A. Irvine
 */
public class A063424 extends A062095 {

  /** Construct the sequence. */
  public A063424() {
    super(10);
  }
}
