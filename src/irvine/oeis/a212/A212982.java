package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212982 Number of (w,x,y) with all terms in {0,...,n} and w&lt;x+y and x&lt;=y.
 * @author Sean A. Irvine
 */
public class A212982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212982() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 11, 27, 53});
  }
}
