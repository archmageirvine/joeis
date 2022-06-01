package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169622 a(n) = a(n-1) + Fibonacci(n), a(1)=5.
 * @author Sean A. Irvine
 */
public class A169622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169622() {
    super(new long[] {-1, 0, 2}, new long[] {5, 6, 8});
  }
}
