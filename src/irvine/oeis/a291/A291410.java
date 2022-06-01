package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291410 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S - S^2 - 2 S^3.
 * @author Sean A. Irvine
 */
public class A291410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291410() {
    super(new long[] {2, 6, 7, 4, 2, 1}, new long[] {1, 3, 9, 26, 69, 186});
  }
}
