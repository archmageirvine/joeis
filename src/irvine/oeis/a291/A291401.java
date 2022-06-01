package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291401 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S - S^4.
 * @author Sean A. Irvine
 */
public class A291401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291401() {
    super(new long[] {1, 4, 6, 4, 1, 0, 1, 1}, new long[] {1, 2, 3, 6, 14, 32, 67, 134});
  }
}
