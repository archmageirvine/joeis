package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211535 Number of ordered triples (w,x,y) with all terms in <code>{1,...,n}</code> and w=4x+5y.
 * @author Sean A. Irvine
 */
public class A211535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211535() {
    super(new long[] {1, -1, 0, 0, -1, 0, 1, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
