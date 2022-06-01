package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212760 Number of (w,x,y,z) with all terms in {0,...,n}, w even, and x = y + z.
 * @author Sean A. Irvine
 */
public class A212760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212760() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 12, 20, 45, 63, 112});
  }
}
