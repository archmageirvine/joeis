package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291732 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = (1 - 2 S)^2.
 * @author Sean A. Irvine
 */
public class A291732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291732() {
    super(new long[] {-4, 0, -8, 4, -4, 4}, new long[] {4, 12, 36, 104, 288, 780});
  }
}
