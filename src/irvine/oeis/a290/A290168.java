package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290168.
 * @author Sean A. Irvine
 */
public class A290168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290168() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 2, 3, 12, 15, 36});
  }
}
