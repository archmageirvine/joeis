package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211544 Number of ordered triples (w,x,y) with all terms in {1,...,n} and 2w=3x-5y.
 * @author Sean A. Irvine
 */
public class A211544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211544() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {0, 0, 0, 1, 2, 3, 4, 5, 8});
  }
}
