package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227327 Number of non-equivalent ways to choose two points in <code>an</code> equilateral triangle grid of side n.
 * @author Sean A. Irvine
 */
public class A227327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227327() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 4, 10, 22, 41, 72});
  }
}
