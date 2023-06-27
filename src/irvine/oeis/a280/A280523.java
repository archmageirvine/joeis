package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280523 a(n) = Fibonacci(2n + 1) - n.
 * @author Sean A. Irvine
 */
public class A280523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280523() {
    super(1, new long[] {-1, 5, -8, 5}, new long[] {1, 3, 10, 30});
  }
}
