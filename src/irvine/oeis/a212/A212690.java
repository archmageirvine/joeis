package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212690 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and 2|w-x|&lt;=n+|y-z|.
 * @author Sean A. Irvine
 */
public class A212690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212690() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 16, 75, 236, 567, 1172});
  }
}
