package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211617 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and 2w+x+y&gt;0.
 * @author Sean A. Irvine
 */
public class A211617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211617() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 30, 101, 244});
  }
}
