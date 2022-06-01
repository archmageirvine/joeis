package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218439 a(n) = A001609(n)^2, where g.f. of A001609 is x*(1+3*x^2)/(1-x-x^3).
 * @author Sean A. Irvine
 */
public class A218439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218439() {
    super(new long[] {-1, -1, 1, 3, 1, 1}, new long[] {1, 1, 16, 25, 36, 100});
  }
}
