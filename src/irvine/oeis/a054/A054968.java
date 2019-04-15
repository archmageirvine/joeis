package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054968 <code>3*Fibonacci(n) - 11</code>.
 * @author Sean A. Irvine
 */
public class A054968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054968() {
    super(new long[] {-1, 0, 2}, new long[] {4, 13, 28});
  }
}
