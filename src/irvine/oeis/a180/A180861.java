package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180861 Wiener index of the n-pan graph.
 * @author Sean A. Irvine
 */
public class A180861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180861() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 8, 16, 26, 42});
  }
}
