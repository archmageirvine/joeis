package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099374 Squares of A041041(n-1), <code>n&gt;=1</code> (generalized Fibonacci).
 * @author Sean A. Irvine
 */
public class A099374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099374() {
    super(new long[] {-1, 101, 101}, new long[] {0, 1, 100});
  }
}
