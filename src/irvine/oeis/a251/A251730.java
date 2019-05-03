package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251730 Numbers n such that the sum of the triangular numbers <code>T(n)</code> and <code>T(n+1)</code> is equal to the sum of two pentagonal numbers <code>P(m)</code> and <code>P(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A251730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251730() {
    super(new long[] {1, -15, 15}, new long[] {10, 152, 2130});
  }
}
