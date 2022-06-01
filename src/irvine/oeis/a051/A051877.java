package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051877 Partial sums of A051740.
 * @author Sean A. Irvine
 */
public class A051877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051877() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 12, 57, 182, 462, 1008});
  }
}
