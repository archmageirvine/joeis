package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134489 a(n) = Fibonacci(5*n + 2).
 * @author Sean A. Irvine
 */
public class A134489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134489() {
    super(new long[] {1, 11}, new long[] {1, 13});
  }
}
