package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211521 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and w <code>+ 2x = 4y</code>.
 * @author Sean A. Irvine
 */
public class A211521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211521() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 0, 1, 2, 4, 5, 9});
  }
}
