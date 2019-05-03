package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211625 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{-n,...,-1,1,...,n}</code> and <code>w+3x+3y&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A211625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211625() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 4, 32, 104, 250, 492, 845, 1349});
  }
}
