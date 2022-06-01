package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087123 a(n) = Fibonacci(n+1) - (-1)^n*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A087123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087123() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 2, 1, 5});
  }
}
