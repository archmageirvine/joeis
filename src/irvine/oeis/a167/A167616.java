package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167616 a(n) = Fibonacci(n) - 5.
 * @author Sean A. Irvine
 */
public class A167616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167616() {
    super(5, new long[] {-1, 0, 2}, new long[] {0, 3, 8});
  }
}
