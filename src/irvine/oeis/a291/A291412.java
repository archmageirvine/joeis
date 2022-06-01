package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291412 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S - 2 S^2 + S^3.
 * @author Sean A. Irvine
 */
public class A291412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291412() {
    super(new long[] {-1, -3, -1, 3, 3, 1}, new long[] {1, 4, 10, 24, 62, 156});
  }
}
