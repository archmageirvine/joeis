package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212976 Number of (w,x,y) with all terms in {0,...,n} and odd range.
 * @author Sean A. Irvine
 */
public class A212976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212976() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 6, 12, 36, 60, 114});
  }
}
