package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006235 Number of spanning trees of the n-prism graph Y_n (regarding case n = 2 as a multigraph).
 * @author Sean A. Irvine
 */
public class A006235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006235() {
    super(1, new long[] {-1, 10, -35, 52, -35, 10}, new long[] {1, 12, 75, 384, 1805, 8100});
  }
}

