package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251924 Numbers n such that the sum of the triangular numbers <code>T(n)</code> and <code>T(n+1)</code> is equal to a hexagonal number <code>H(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A251924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251924() {
    super(new long[] {1, -35, 35}, new long[] {0, 34, 1188});
  }
}
