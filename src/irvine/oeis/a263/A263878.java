package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263878 <code>a(n) = Sum_{k=0..n} (-1)^k*k*Fibonacci(k),</code> where <code>Fibonacci(k) =</code> A000045(k).
 * @author Sean A. Irvine
 */
public class A263878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263878() {
    super(new long[] {1, -3, 1, 3, -1}, new long[] {0, -1, 1, -5, 7});
  }
}
