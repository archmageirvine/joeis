package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226493 Closed walks of length n in K_4 graph.
 * @author Sean A. Irvine
 */
public class A226493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226493() {
    super(1, new long[] {3, 2}, new long[] {0, 12});
  }
}
