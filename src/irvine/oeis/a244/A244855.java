package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244855 a(n) = Fibonacci(n)^4-1.
 * @author Sean A. Irvine
 */
public class A244855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244855() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {0, 0, 15, 80, 624});
  }
}
