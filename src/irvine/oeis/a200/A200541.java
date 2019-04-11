package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200541 Product of Fibonacci and tribonacci numbers: <code>a(n) =</code> A000045(n+1)*A000073(n+2).
 * @author Sean A. Irvine
 */
public class A200541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200541() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {1, 1, 4, 12, 35, 104});
  }
}
