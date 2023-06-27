package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228319 The hyper-Wiener index of the graph obtained by applying Mycielski's construction to the star graph K(1,n).
 * @author Sean A. Irvine
 */
public class A228319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228319() {
    super(1, new long[] {1, -3, 3}, new long[] {20, 45, 82});
  }
}
