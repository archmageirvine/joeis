package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212519 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&gt;2x</code> and <code>y&gt;=3z</code>.
 * @author Sean A. Irvine
 */
public class A212519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212519() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 1, 4, 12, 30, 63, 108, 192, 300, 450, 660, 936, 1260, 1715});
  }
}
