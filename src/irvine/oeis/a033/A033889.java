package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033889 <code>a(n) =</code> Fibonacci(4*n <code>+ 1)</code>.
 * @author Sean A. Irvine
 */
public class A033889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033889() {
    super(new long[] {-1, 7}, new long[] {1, 5});
  }
}
