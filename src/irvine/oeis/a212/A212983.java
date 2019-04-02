package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212983 Number of (w,x,y) with all terms in {0,...,n} and w&lt;=x+y and x&lt;=y.
 * @author Sean A. Irvine
 */
public class A212983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212983() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 5, 15, 33, 62});
  }
}
