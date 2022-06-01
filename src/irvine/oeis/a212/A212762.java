package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212762 Number of (w,x,y,z) with all terms in {0,...,n}, w and x odd, y even.
 * @author Sean A. Irvine
 */
public class A212762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212762() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 2, 6, 32, 60, 162, 252, 512, 720});
  }
}
