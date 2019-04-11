package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211538 Number of ordered triples (w,x,y) with all terms in <code>{1,</code>...,n} and 2w=2n-2x-y.
 * @author Sean A. Irvine
 */
public class A211538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211538() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 0, 1, 3});
  }
}
