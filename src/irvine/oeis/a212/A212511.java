package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212511 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&lt;2x and <code>y&gt;=3z</code>.
 * @author Sean A. Irvine
 */
public class A212511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212511() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 7, 24, 57, 135, 259, 432, 732, 1125, 1638, 2376, 3302, 4410, 5915});
  }
}
