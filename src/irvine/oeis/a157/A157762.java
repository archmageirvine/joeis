package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157762 a(n) = 15780962*n^2 - 5618000*n + 500001.
 * @author Sean A. Irvine
 */
public class A157762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157762() {
    super(1, new long[] {1, -3, 3}, new long[] {10662963, 52387849, 125674659});
  }
}
