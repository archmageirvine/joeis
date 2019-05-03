package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212767 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code>, w even, x even, and <code>w+x=y+z</code>.
 * @author Sean A. Irvine
 */
public class A212767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212767() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 1, 8, 10, 29, 35, 72});
  }
}
