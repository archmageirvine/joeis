package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175887 Numbers that are congruent to {1, 14} mod 15.
 * @author Sean A. Irvine
 */
public class A175887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175887() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 14, 16});
  }
}
