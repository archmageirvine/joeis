package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251730 Numbers n such that the sum of the triangular numbers T(n) and T(n+1) is equal to the sum of two pentagonal numbers P(m) and P(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A251730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251730() {
    super(new long[] {1, -15, 15}, new long[] {10, 152, 2130});
  }
}
