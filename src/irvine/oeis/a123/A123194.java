package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123194 a(n) = (n+1)*Fibonacci(n+2) + 3.
 * @author Sean A. Irvine
 */
public class A123194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123194() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {4, 7, 12, 23, 43});
  }
}
