package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238600 A sixth-order linear divisibility sequence related to the Fibonacci numbers: <code>a(n) </code>:= <code>(1/6)*Fibonacci(3*n)*Fibonacci(4*n)/Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A238600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238600() {
    super(new long[] {-1, 14, 90, -350, 90, 14}, new long[] {1, 28, 408, 7896, 137555, 2496144});
  }
}
