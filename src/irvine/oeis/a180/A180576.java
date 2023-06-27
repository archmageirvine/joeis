package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180576 Wiener index of the n-web graph.
 * @author Sean A. Irvine
 */
public class A180576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180576() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {4, 27, 69, 148, 255, 417});
  }
}
