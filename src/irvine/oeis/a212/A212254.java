package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212254 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w=x+2y+3z-n</code>.
 * @author Sean A. Irvine
 */
public class A212254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212254() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 0, 0, 1, 4, 11, 21});
  }
}
