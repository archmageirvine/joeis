package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077447 Numbers k such that (k^2 - 14)/2 is a square.
 * @author Sean A. Irvine
 */
public class A077447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077447() {
    super(1, new long[] {-1, 0, 6, 0}, new long[] {4, 8, 16, 44});
  }
}
