package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292018 Wiener index for the n-Andrasfai graph.
 * @author Sean A. Irvine
 */
public class A292018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292018() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 44});
  }
}
