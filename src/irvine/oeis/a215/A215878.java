package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215878 Lengths of loops in the <code>P2</code> Penrose tiling.
 * @author Sean A. Irvine
 */
public class A215878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215878() {
    super(new long[] {6, 0, 5, 0}, new long[] {10, 20, 80, 100});
  }
}
