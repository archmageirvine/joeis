package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207539 Dodecanacci numbers <code>(12th-order</code> Fibonacci <code>sequence): a(n) = a(n-1) +...+ a(n-12)</code> with <code>a(0)=...=a(11)=1</code>.
 * @author Sean A. Irvine
 */
public class A207539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207539() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
