package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267942.
 * @author Sean A. Irvine
 */
public class A267942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267942() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {3, 3, 2, 6, 3});
  }
}
