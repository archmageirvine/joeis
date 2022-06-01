package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138590 a(n) = Fibonacci(9*n).
 * @author Sean A. Irvine
 */
public class A138590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138590() {
    super(new long[] {1, 76}, new long[] {0, 34});
  }
}
