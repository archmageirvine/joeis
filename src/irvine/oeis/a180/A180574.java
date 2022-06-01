package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180574 Wiener index of the n-sunlet graph.
 * @author Sean A. Irvine
 */
public class A180574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180574() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {27, 60, 105, 174, 259, 376});
  }
}
