package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143212 a(n) = Fibonacci(n) * (Fibonacci(n+2) - 1).
 * @author Sean A. Irvine
 */
public class A143212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143212() {
    super(1, new long[] {1, -1, -5, 1, 3}, new long[] {1, 2, 8, 21, 60});
  }
}
