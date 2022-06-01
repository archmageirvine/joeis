package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211539 Number of ordered triples (w,x,y) with all terms in {1,...,n} and 2w = 2n - 2x + y.
 * @author Sean A. Irvine
 */
public class A211539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211539() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 2, 3, 7});
  }
}
