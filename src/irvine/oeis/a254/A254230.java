package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254230 Heptagonal numbers (A000566) which are also centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A254230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254230() {
    super(new long[] {1, -1, -103682, 103682, 1}, new long[] {1, 4141, 85285, 429332905, 8842505113L});
  }
}
