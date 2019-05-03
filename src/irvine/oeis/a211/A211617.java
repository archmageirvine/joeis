package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211617 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{-n,...-1,1,...,n}</code> and <code>2w+x+y&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A211617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211617() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 30, 101, 244});
  }
}
