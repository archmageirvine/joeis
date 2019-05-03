package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211546 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and <code>w=3x-3y</code>.
 * @author Sean A. Irvine
 */
public class A211546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211546() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 0, 2, 3, 4, 9});
  }
}
