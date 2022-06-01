package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183873 n-1+ceiling((1/5)n^2); complement of A183872.
 * @author Sean A. Irvine
 */
public class A183873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183873() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 2, 4, 7, 9, 13, 16});
  }
}
