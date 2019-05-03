package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212516 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&gt;2x</code> and <code>y&lt;3z</code>.
 * @author Sean A. Irvine
 */
public class A212516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212516() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 8, 28, 88, 186, 378, 660, 1104, 1700, 2575, 3660, 5148, 6972, 9310});
  }
}
