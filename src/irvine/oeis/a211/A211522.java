package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211522 Number of ordered triples (w,x,y) with all terms in {1,...,n} and w + 5y = 2x.
 * @author Sean A. Irvine
 */
public class A211522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211522() {
    super(new long[] {1, -1, -1, 1, 0, -1, 1, 1}, new long[] {0, 0, 0, 1, 2, 3, 4, 6});
  }
}
