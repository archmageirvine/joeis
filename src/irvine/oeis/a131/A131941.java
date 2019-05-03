package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131941 Partial sums of <code>ceiling(n^2/2) (A000982)</code>.
 * @author Sean A. Irvine
 */
public class A131941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131941() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 3, 8, 16});
  }
}
