package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163551 13th order Fibonacci numbers: a(n) = a(n-1) +...+ a(n-13) with a(1)=...=a(13)=1.
 * @author Sean A. Irvine
 */
public class A163551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163551() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
