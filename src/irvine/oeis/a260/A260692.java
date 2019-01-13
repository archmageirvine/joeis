package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260692.
 * @author Sean A. Irvine
 */
public class A260692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260692() {
    super(new long[] {10000000, 0, -10011000, 0, 11001, 0}, new long[] {1, 1, 1000, 1001111, 1000000, 11001111111L});
  }
}
