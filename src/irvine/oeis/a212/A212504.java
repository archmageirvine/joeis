package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212504 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;2x and y&gt;2z.
 * @author Sean A. Irvine
 */
public class A212504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212504() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 7, 24, 76, 162, 333});
  }
}
