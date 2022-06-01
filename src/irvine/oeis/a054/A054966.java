package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054966 Numbers that are congruent to {0, 1, 8} mod 9.
 * @author Sean A. Irvine
 */
public class A054966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054966() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 8, 9});
  }
}
