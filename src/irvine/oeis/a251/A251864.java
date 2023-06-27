package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251864 Numbers n such that the sum of the pentagonal numbers P(n), P(n+1) and P(n+2) is equal to the sum of the octagonal numbers N(m), N(m+1) and N(m+2) for some m.
 * @author Sean A. Irvine
 */
public class A251864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251864() {
    super(1, new long[] {1, -1, -1154, 1154, 1}, new long[] {3, 208, 4387, 240992, 5063555});
  }
}
