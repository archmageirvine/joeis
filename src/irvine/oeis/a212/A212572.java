package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212572 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and |w-x| <code>&lt;=</code> |x-y| + |y-z|.
 * @author Sean A. Irvine
 */
public class A212572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212572() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 14, 71, 220, 533, 1094});
  }
}
