package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175886 Numbers that are congruent to {1, 12} mod 13.
 * @author Sean A. Irvine
 */
public class A175886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175886() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 12, 14});
  }
}
