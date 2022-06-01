package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291006 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - S - S^2 - S^3 - S^4.
 * @author Sean A. Irvine
 */
public class A291006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291006() {
    super(new long[] {-1, 6, -8, 5}, new long[] {1, 3, 9, 27});
  }
}
