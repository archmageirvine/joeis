package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251963 Numbers n such that the sum of the triangular numbers <code>T(n)</code> and <code>T(n+1)</code> is equal to an octagonal number N(m) for some m.
 * @author Sean A. Irvine
 */
public class A251963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251963() {
    super(new long[] {1, -15, 15}, new long[] {0, 14, 208});
  }
}
