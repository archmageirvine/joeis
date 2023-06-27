package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259159 Positive squares (A000290) that are heptagonal numbers (A000566) divided by 2.
 * @author Sean A. Irvine
 */
public class A259159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259159() {
    super(1, new long[] {1, -103683, 103683}, new long[] {9, 938961, 97353360225L});
  }
}
