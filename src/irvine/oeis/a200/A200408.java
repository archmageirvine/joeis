package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200408 -4 + 5*Fibonacci(n+1)^2.
 * @author Sean A. Irvine
 */
public class A200408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200408() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 16, 41, 121});
  }
}
