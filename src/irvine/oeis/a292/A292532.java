package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292532 p-INVERT of the squares (A000290), where p(S) = 1 - S^3.
 * @author Sean A. Irvine
 */
public class A292532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292532() {
    super(new long[] {1, -9, 36, -83, 129, -123, 85, -36, 9}, new long[] {0, 0, 1, 12, 75, 329, 1158, 3606, 10971});
  }
}
