package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163551 13th order Fibonacci numbers: <code>a(n) = a(n-1) +</code>...+ <code>a(n-13)</code> with <code>a(1)=</code>...=a(13)=1.
 * @author Sean A. Irvine
 */
public class A163551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163551() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
