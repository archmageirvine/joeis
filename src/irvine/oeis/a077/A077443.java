package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077443 Numbers k such that (k^2 - 7)/2 is a square.
 * @author Sean A. Irvine
 */
public class A077443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077443() {
    super(new long[] {-1, 0, 6, 0}, new long[] {3, 5, 13, 27});
  }
}
