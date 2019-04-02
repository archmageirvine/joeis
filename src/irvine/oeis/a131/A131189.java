package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131189 Numbers n&gt;=0 such that d(n) = (n^1 + 1) (n^2 + 2) ... (n^14 + 14) / 14!, e(n) = (n^1 + 1) (n^2 + 2) ... (n^15 + 15) / 15!, and f(n) = (n^1 + 1) (n^2 + 2) ... (n^16 + 16) / 16! take nonintegral values.
 * @author Sean A. Irvine
 */
public class A131189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131189() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {2, 9, 16, 23, 30, 37, 51});
  }
}
