package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212766 Number of (w,x,y,z) with all terms in {0,...,n}, w even and x odd.
 * @author Sean A. Irvine
 */
public class A212766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212766() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 4, 18, 64, 150, 324, 588, 1024});
  }
}
