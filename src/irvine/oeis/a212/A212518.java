package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212518 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&gt;2x and <code>y&gt;3z</code>.
 * @author Sean A. Irvine
 */
public class A212518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212518() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 0, 2, 8, 18, 45, 84, 144, 240, 375, 540, 792, 1092, 1470});
  }
}
