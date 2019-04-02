package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134504 a(n) = Fibonacci(7n + 6).
 * @author Sean A. Irvine
 */
public class A134504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134504() {
    super(new long[] {1, 29}, new long[] {8, 233});
  }
}
