package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251914 Numbers n such that the sum of the triangular numbers <code>T(n)</code> and <code>T(n+1)</code> is equal to the pentagonal number P(m) for some m.
 * @author Sean A. Irvine
 */
public class A251914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251914() {
    super(new long[] {1, -99, 99}, new long[] {0, 98, 9700});
  }
}
