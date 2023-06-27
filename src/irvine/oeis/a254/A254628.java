package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254628 Triangular numbers (A000217) that are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A254628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254628() {
    super(1, new long[] {1, -1, -322, 322, 1}, new long[] {1, 6, 276, 1891, 88831});
  }
}
