package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162483 a(n) is the number of perfect matchings of an edge-labeled 2 X (2n+1) Mobius grid graph.
 * @author Sean A. Irvine
 */
public class A162483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162483() {
    super(new long[] {1, -4, 4}, new long[] {3, 6, 13});
  }
}
