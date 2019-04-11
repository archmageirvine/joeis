package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212978 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and range = 2*n-w-x.
 * @author Sean A. Irvine
 */
public class A212978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212978() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 5, 11, 20, 32});
  }
}
