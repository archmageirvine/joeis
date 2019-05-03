package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211626 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{-n,...-1,1,...,n}</code> and <code>w+4x+4y&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A211626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211626() {
    super(new long[] {-1, 2, -1, 0, 2, -4, 2, 0, -1, 2}, new long[] {0, 4, 32, 108, 250, 492, 854, 1360, 2021, 2885});
  }
}
