package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211627 Number of ordered triples (w,x,y) with all terms in {-n,...-1,1,...,n} and w+5x+5y&gt;0.
 * @author Sean A. Irvine
 */
public class A211627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211627() {
    super(new long[] {-1, 2, -1, 0, 0, 2, -4, 2, 0, 0, -1, 2}, new long[] {0, 4, 32, 108, 256, 492, 854, 1360, 2034, 2900, 3965, 5285});
  }
}
