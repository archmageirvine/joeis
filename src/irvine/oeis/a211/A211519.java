package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211519 Number of ordered triples (w,x,y) with all terms in {1,...,n} and w=2x+3y.
 * @author Sean A. Irvine
 */
public class A211519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211519() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 1, 2, 3, 6, 8});
  }
}
