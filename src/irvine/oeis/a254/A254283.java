package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254283 Indices of hexagonal numbers (A000384) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A254283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254283() {
    super(new long[] {1, -1, -194, 194, 1}, new long[] {1, 31, 115, 5965, 22261});
  }
}
