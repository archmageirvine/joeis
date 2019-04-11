package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158058 <code>a(n) = 16*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A158058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158058() {
    super(new long[] {1, -3, 3}, new long[] {14, 60, 138});
  }
}
