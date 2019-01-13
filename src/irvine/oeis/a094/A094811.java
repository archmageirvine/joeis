package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094811.
 * @author Sean A. Irvine
 */
public class A094811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094811() {
    super(new long[] {4, -10, 6}, new long[] {1, 6, 26});
  }
}
