package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251963 Numbers n such that the sum of the triangular numbers T(n) and T(n+1) is equal to <code>an</code> octagonal number N(m) for some m.
 * @author Sean A. Irvine
 */
public class A251963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251963() {
    super(new long[] {1, -15, 15}, new long[] {0, 14, 208});
  }
}
