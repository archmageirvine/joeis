package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211521 Number of ordered triples (w,x,y) with all terms in {1,...,n} and w + 2x = 4y.
 * @author Sean A. Irvine
 */
public class A211521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211521() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 0, 1, 2, 4, 5, 9});
  }
}
