package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092476 Numbers that are congruent to {1, 3, 9} mod 13.
 * @author Sean A. Irvine
 */
public class A092476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092476() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 3, 9, 14});
  }
}
