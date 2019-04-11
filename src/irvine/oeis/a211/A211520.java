package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211520 Number of ordered triples (w,x,y) with all terms in <code>{1,</code>...,n} and w + 4y <code>= 2x</code>.
 * @author Sean A. Irvine
 */
public class A211520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211520() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 0, 0, 1, 2, 3, 5});
  }
}
