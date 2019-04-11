package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207539 Dodecanacci numbers (12th-order Fibonacci sequence): <code>a(n) = a(n-1) +</code>...+ <code>a(n-12)</code> with <code>a(0)=</code>...=a(11)=1.
 * @author Sean A. Irvine
 */
public class A207539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207539() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
