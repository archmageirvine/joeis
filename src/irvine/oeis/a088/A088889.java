package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088889 Polynexus numbers of order 8.
 * @author Sean A. Irvine
 */
public class A088889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088889() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 26, 245, 1353, 5368, 17017, 45878});
  }
}
