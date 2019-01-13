package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195605.
 * @author Sean A. Irvine
 */
public class A195605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195605() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 7, 18, 31});
  }
}
