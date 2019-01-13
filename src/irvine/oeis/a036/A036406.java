package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036406.
 * @author Sean A. Irvine
 */
public class A036406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036406() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 1, 2, 2, 4});
  }
}
