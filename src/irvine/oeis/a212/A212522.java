package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212522 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&gt;=2x and <code>y&gt;3z</code>.
 * @author Sean A. Irvine
 */
public class A212522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212522() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 0, 4, 12, 27, 60, 112, 180, 300, 450, 648, 924, 1274, 1680});
  }
}
