package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212759 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and w, x, and y even.
 * @author Sean A. Irvine
 */
public class A212759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212759() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1, 2, 24, 32, 135, 162, 448, 512, 1125});
  }
}
