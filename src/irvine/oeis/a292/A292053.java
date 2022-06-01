package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292053 Wiener index of the n X n king graph.
 * @author Sean A. Irvine
 */
public class A292053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292053() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 6, 52, 228, 708, 1778});
  }
}
