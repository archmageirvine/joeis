package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007492 Fibonacci(n) - (-1)^n.
 * @author Sean A. Irvine
 */
public class A007492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007492() {
    super(1, new long[] {1, 2, 0}, new long[] {2, 0, 3});
  }
}
