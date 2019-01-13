package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290651.
 * @author Sean A. Irvine
 */
public class A290651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290651() {
    super(new long[] {-6, 17, -17, 7}, new long[] {4, 6, 11, 26});
  }
}
