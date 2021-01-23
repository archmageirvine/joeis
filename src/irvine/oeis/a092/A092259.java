package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092259 Numbers that are congruent to {4, 8} mod 12.
 * @author Sean A. Irvine
 */
public class A092259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092259() {
    super(new long[] {-1, 1, 1}, new long[] {4, 8, 16});
  }
}
