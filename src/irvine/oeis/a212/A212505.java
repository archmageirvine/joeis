package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212505 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;2x and y&gt;=2z.
 * @author Sean A. Irvine
 */
public class A212505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212505() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 3, 14, 48, 114, 243, 444});
  }
}
