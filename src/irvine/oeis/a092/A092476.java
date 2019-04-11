package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092476 Numbers that are congruent to <code>{1, 3, 9} mod 13</code>.
 * @author Sean A. Irvine
 */
public class A092476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092476() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 9, 14});
  }
}
