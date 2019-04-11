package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212970 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and w!=x and x&gt;range{w,x,y}.
 * @author Sean A. Irvine
 */
public class A212970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212970() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 2, 8, 22, 44, 80});
  }
}
