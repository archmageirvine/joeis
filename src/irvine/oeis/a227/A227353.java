package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227353 Number of lattice points in the closed region bounded by the graphs of <code>y = 3*x/5, x =</code> n, and <code>y = 0</code>, excluding points on the <code>x-axis</code>.
 * @author Sean A. Irvine
 */
public class A227353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227353() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 1, 2, 4, 7, 10, 14});
  }
}
