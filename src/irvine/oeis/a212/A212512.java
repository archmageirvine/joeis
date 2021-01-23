package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212512 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;=2x and y&lt;3z.
 * @author Sean A. Irvine
 */
public class A212512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212512() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 1, 16, 64, 196, 462, 930, 1680, 2860, 4485, 6800, 9888, 13908, 19019, 25564, 33440});
  }
}
