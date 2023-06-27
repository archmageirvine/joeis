package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292059 Wiener index of the n X n white bishop graph.
 * @author Sean A. Irvine
 */
public class A292059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292059() {
    super(2, new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 8, 42, 104, 251, 464, 852, 1360});
  }
}
