package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292057 Wiener index of the n X n queen graph.
 * @author Sean A. Irvine
 */
public class A292057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292057() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 44, 164, 440});
  }
}
