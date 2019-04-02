package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087124 a(n) = Fibonacci(n) + Fibonacci(2n+1).
 * @author Sean A. Irvine
 */
public class A087124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087124() {
    super(new long[] {1, -2, -3, 4}, new long[] {1, 3, 6, 15});
  }
}
