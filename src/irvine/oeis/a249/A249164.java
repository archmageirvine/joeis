package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249164 Numbers n such that the triangular number T(n) is equal to the sum of the pentagonal numbers P(m) and P(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A249164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249164() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 3, 113, 331, 11121});
  }
}
