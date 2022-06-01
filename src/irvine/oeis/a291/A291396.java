package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291396 p-INVERT of (1,1,0,0,0,0,...), where p(S) = (1 - S)(1 - 2 S)(1 - 3 S).
 * @author Sean A. Irvine
 */
public class A291396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291396() {
    super(new long[] {6, 18, 7, -16, -5, 6}, new long[] {6, 31, 140, 596, 2440, 9751});
  }
}
