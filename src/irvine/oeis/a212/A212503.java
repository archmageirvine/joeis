package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212503 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w&lt;2x and y&lt;2z.
 * @author Sean A. Irvine
 */
public class A212503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212503() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 9, 49, 144, 361, 729, 1369});
  }
}
