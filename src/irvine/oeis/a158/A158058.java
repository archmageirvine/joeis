package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158058 a(n) = 16*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158058() {
    super(new long[] {1, -3, 3}, new long[] {14, 60, 138});
  }
}
