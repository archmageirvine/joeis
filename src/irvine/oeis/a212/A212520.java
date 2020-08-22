package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212520 Number of (w,x,y,z) with all terms in {1,...,n} and w&gt;=2x and y&lt;3z.
 * @author Sean A. Irvine
 */
public class A212520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212520() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 4, 16, 56, 132, 279, 504, 880, 1380, 2125, 3090, 4392, 6006, 8134, 10640});
  }
}
