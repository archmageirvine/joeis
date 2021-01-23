package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212519 Number of (w,x,y,z) with all terms in {1,...,n} and w&gt;2x and y&gt;=3z.
 * @author Sean A. Irvine
 */
public class A212519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212519() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 1, 4, 12, 30, 63, 108, 192, 300, 450, 660, 936, 1260, 1715});
  }
}
