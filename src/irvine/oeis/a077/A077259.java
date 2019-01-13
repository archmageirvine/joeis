package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077259.
 * @author Sean A. Irvine
 */
public class A077259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077259() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {0, 2, 6, 44, 116});
  }
}
