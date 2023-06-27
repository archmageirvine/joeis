package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228310 The hyper-Wiener index of the hypercube graph Q(n) (n&gt;=2).
 * @author Sean A. Irvine
 */
public class A228310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228310() {
    super(2, new long[] {64, -48, 12}, new long[] {10, 72, 448});
  }
}
