package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212145 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and w&lt;2x+y+z.
 * @author Sean A. Irvine
 */
public class A212145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212145() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 1, 16, 81, 255, 621});
  }
}
