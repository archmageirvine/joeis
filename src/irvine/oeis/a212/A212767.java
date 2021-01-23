package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212767 Number of (w,x,y,z) with all terms in {0,...,n}, w even, x even, and w+x=y+z.
 * @author Sean A. Irvine
 */
public class A212767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212767() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 1, 8, 10, 29, 35, 72});
  }
}
