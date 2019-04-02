package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292051 Wiener index of the n X n black bishop graph.
 * @author Sean A. Irvine
 */
public class A292051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292051() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 14, 42, 124, 251, 506, 852});
  }
}
