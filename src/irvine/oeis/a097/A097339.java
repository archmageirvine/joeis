package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097339 2^n+n^3.
 * @author Sean A. Irvine
 */
public class A097339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097339() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 3, 12, 35, 80});
  }
}
