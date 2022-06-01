package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181658 Row sums of A181657.
 * @author Sean A. Irvine
 */
public class A181658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181658() {
    super(new long[] {-1, 0, -1, 0, 3, 0}, new long[] {1, 2, 3, 7, 8, 19});
  }
}
