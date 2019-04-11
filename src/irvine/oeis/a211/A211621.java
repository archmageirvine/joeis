package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211621 Number of ordered triples (w,x,y) with all terms in <code>{-n,</code>...-1,1,...,n} and w+2x+3y&gt;0.
 * @author Sean A. Irvine
 */
public class A211621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211621() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 3, 29, 103, 247, 484, 843});
  }
}
