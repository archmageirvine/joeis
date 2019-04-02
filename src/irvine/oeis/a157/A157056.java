package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157056 Number of integer sequences of length n+1 with sum zero and sum of absolute values 14.
 * @author Sean A. Irvine
 */
public class A157056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157056() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {2, 42, 492, 4060, 26070, 137886, 623576, 2476296, 8809110, 28512110, 85014204, 235895244, 614266354, 1511679210, 3536846160L});
  }
}
