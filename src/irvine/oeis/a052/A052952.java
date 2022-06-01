package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052952 a(n) = Fibonacci(n+2) - (1-(-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A052952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052952() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 1, 3, 4});
  }
}
