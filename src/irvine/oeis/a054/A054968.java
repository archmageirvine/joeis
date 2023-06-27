package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054968 3*Fibonacci(n) - 11.
 * @author Sean A. Irvine
 */
public class A054968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054968() {
    super(5, new long[] {-1, 0, 2}, new long[] {4, 13, 28});
  }
}
