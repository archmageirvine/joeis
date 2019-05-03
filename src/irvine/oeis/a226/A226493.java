package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226493 Closed walks of length n in <code>K_4</code> graph.
 * @author Sean A. Irvine
 */
public class A226493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226493() {
    super(new long[] {3, 2}, new long[] {0, 12});
  }
}
