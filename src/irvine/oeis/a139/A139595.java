package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139595.
 * @author Sean A. Irvine
 */
public class A139595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139595() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 5, 13, 26});
  }
}
