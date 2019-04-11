package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211524 Number of ordered triples (w,x,y) with all terms in <code>{1,</code>...,n} and w=3x+5y.
 * @author Sean A. Irvine
 */
public class A211524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211524() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
