package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212514 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;=2x and y&gt;3z.
 * @author Sean A. Irvine
 */
public class A212514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212514() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 0, 14, 42, 90, 200, 364, 585, 960, 1440, 2052, 2926, 4004, 5280});
  }
}
