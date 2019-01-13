package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137883.
 * @author Sean A. Irvine
 */
public class A137883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137883() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {72, 144, 280, 456, 728, 1056});
  }
}
