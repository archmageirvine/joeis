package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291396 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = (1 - S)(1 - 2 S)(1 - 3 S)</code>.
 * @author Sean A. Irvine
 */
public class A291396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291396() {
    super(new long[] {6, 18, 7, -16, -5, 6}, new long[] {6, 31, 140, 596, 2440, 9751});
  }
}
