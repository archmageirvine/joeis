package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292045 Wiener index of the n X n X n grid graph.
 * @author Sean A. Irvine
 */
public class A292045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292045() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 48, 972, 7680, 37500, 136080, 403368, 1032192});
  }
}
