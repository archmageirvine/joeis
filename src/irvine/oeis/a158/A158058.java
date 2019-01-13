package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158058.
 * @author Sean A. Irvine
 */
public class A158058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158058() {
    super(new long[] {1, -3, 3}, new long[] {14, 60, 138});
  }
}
