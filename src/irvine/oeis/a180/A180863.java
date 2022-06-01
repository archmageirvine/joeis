package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180863 Wiener index of the n-sun graph.
 * @author Sean A. Irvine
 */
public class A180863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180863() {
    super(new long[] {1, -3, 3}, new long[] {6, 21, 44});
  }
}
