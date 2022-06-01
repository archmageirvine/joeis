package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081589 Third row of Pascal-(1,5,1) array A081580.
 * @author Sean A. Irvine
 */
public class A081589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081589() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 61});
  }
}
