package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077262.
 * @author Sean A. Irvine
 */
public class A077262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077262() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {0, 5, 14, 99, 260});
  }
}
