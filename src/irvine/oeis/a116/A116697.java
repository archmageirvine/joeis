package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116697 a(n) = cos(n*Pi/2)-F(n)*(-1)^n, where F(n) = Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A116697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116697() {
    super(new long[] {1, -1, 0, -1}, new long[] {1, 1, -2, 2});
  }
}
