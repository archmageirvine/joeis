package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163322.
 * @author Sean A. Irvine
 */
public class A163322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163322() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -4, 40, 180});
  }
}
