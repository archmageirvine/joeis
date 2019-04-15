package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238536 A fourth-order linear divisibility sequence related to the Fibonacci numbers: <code>a(n) = (1/2)*Fibonacci(3*n)*Lucas(n)</code>.
 * @author Sean A. Irvine
 */
public class A238536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238536() {
    super(new long[] {-1, 4, 19, 4}, new long[] {1, 12, 68, 504});
  }
}
