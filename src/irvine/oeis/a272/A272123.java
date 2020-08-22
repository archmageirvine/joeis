package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272123 a(n) = Fibonacci(3n) - Fibonacci(2n).
 * @author Sean A. Irvine
 */
public class A272123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272123() {
    super(new long[] {1, 1, -12, 7}, new long[] {0, 1, 5, 26});
  }
}
