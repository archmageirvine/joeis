package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212515 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;=2x and y&gt;=3z.
 * @author Sean A. Irvine
 */
public class A212515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212515() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 8, 28, 63, 150, 280, 468, 780, 1200, 1728, 2508, 3458, 4620, 6160});
  }
}
