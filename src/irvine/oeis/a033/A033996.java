package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033996 8 times triangular numbers: <code>a(n) = 4*n*(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033996() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 24});
  }
}
