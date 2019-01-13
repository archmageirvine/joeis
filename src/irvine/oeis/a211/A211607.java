package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211607.
 * @author Sean A. Irvine
 */
public class A211607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211607() {
    super(new long[] {1, -3, 3}, new long[] {10753, 7741, 4951});
  }
}
