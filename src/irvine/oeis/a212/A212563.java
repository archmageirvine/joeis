package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212563 Number of (w,x,y,z) with all terms in {1,...,n} and w+x&lt;=2y+2z.
 * @author Sean A. Irvine
 */
public class A212563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212563() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 16, 78, 240, 577, 1182});
  }
}
