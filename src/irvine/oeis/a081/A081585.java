package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081585 Third row of Pascal-(1,3,1) array A081578.
 * @author Sean A. Irvine
 */
public class A081585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081585() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 33});
  }
}
