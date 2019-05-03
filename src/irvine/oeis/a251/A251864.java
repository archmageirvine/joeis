package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251864 Numbers n such that the sum of the pentagonal numbers <code>P(n), P(n+1)</code> and <code>P(n+2)</code> is equal to the sum of the octagonal numbers <code>N(m), N(m+1)</code> and <code>N(m+2)</code> for some m.
 * @author Sean A. Irvine
 */
public class A251864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251864() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {3, 208, 4387, 240992, 5063555});
  }
}
