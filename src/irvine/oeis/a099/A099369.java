package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099369 Squares of <code>A041025(n-1), n&gt;=1, (generalized Fibonacci)</code>.
 * @author Sean A. Irvine
 */
public class A099369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099369() {
    super(new long[] {-1, 65, 65}, new long[] {0, 1, 64});
  }
}
