package irvine.oeis.a197;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A197649 a(n) = Sum_{k=0..n} k*Fibonacci(2*k).
 * @author Sean A. Irvine
 */
public class A197649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197649() {
    super(new long[] {-1, 6, -11, 6}, new long[] {0, 1, 7, 31});
  }
}
