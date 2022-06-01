package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292488 p-INVERT of the odd positive integers, where p(S) = 1 - S - 5 S^2.
 * @author Sean A. Irvine
 */
public class A292488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292488() {
    super(new long[] {5, 13, -2, 5}, new long[] {1, 9, 52, 261});
  }
}
