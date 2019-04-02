package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181474 Sequence related to the Hankel transform of A105523(n+5).
 * @author Sean A. Irvine
 */
public class A181474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181474() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1, 2, 10, 15, 42, 56, 120, 150, 275});
  }
}
