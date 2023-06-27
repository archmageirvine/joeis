package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254626 Indices of triangular numbers (A000217) that are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A254626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254626() {
    super(1, new long[] {1, -1, -18, 18, 1}, new long[] {1, 3, 23, 61, 421});
  }
}
