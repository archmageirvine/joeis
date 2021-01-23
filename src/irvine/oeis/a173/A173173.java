package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173173 a(n) = ceiling(Fibonacci(n)/2).
 * @author Sean A. Irvine
 */
public class A173173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173173() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 1, 1, 2});
  }
}
