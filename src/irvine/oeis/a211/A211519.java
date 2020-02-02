package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211519 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and <code>w=2x-3y</code>.
 * @author Sean A. Irvine
 */
public class A211519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211519() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {0, 1, 2, 3, 6, 8});
  }
}
