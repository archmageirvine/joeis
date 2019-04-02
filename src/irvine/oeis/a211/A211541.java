package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211541 Number of ordered triples (w,x,y) with all terms in {1,...,n} and 2w=3x-4y.
 * @author Sean A. Irvine
 */
public class A211541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211541() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {0, 0, 1, 1, 3, 3, 6, 7, 11});
  }
}
