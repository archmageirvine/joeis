package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213661 Number of dominating subsets of the wheel graph W_n.
 * @author Sean A. Irvine
 */
public class A213661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213661() {
    super(new long[] {-2, -1, -1, 3}, new long[] {4, 3, 7, 15});
  }
}
