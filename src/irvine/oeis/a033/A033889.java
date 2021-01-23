package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033889 a(n) = Fibonacci(4*n + 1).
 * @author Sean A. Irvine
 */
public class A033889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033889() {
    super(new long[] {-1, 7}, new long[] {1, 5});
  }
}
