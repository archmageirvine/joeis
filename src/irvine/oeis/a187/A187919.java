package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187919.
 * @author Sean A. Irvine
 */
public class A187919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187919() {
    super(new long[] {-9, -24, -2, 8}, new long[] {3, 32, 256, 1912});
  }
}
