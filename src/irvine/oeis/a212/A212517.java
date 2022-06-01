package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212517 Number of (w,x,y,z) with all terms in {1,...,n} and w&gt;2x and y&lt;=3z.
 * @author Sean A. Irvine
 */
public class A212517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212517() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 9, 30, 92, 198, 396, 684, 1152, 1760, 2650, 3780, 5292, 7140, 9555});
  }
}
