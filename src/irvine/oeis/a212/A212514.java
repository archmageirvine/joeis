package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212514 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&lt;=2x and <code>y&gt;3z</code>.
 * @author Sean A. Irvine
 */
public class A212514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212514() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 0, 14, 42, 90, 200, 364, 585, 960, 1440, 2052, 2926, 4004, 5280});
  }
}
