package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238600 A sixth-order linear divisibility sequence related to the Fibonacci numbers: a(n) := (1/6)*Fibonacci(3*n)*Fibonacci(4*n)/Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A238600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238600() {
    super(new long[] {-1, 14, 90, -350, 90, 14}, new long[] {1, 28, 408, 7896, 137555, 2496144});
  }
}
