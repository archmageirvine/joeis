package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222170.
 * @author Sean A. Irvine
 */
public class A222170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222170() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 6, 15, 26});
  }
}
