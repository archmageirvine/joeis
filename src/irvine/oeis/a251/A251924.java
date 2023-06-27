package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251924 Numbers n such that the sum of the triangular numbers T(n) and T(n+1) is equal to a hexagonal number H(m) for some m.
 * @author Sean A. Irvine
 */
public class A251924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251924() {
    super(1, new long[] {1, -35, 35}, new long[] {0, 34, 1188});
  }
}
