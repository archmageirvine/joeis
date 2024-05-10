package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200408 a(n) = -4 + 5*Fibonacci(n+1)^2.
 * @author Sean A. Irvine
 */
public class A200408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200408() {
    super(0, new long[] {1, -3, 0, 3}, new long[] {1, 16, 41, 121}, 1);
  }
}
