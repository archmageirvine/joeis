package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212249 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and 3w&lt;x+y+z+n.
 * @author Sean A. Irvine
 */
public class A212249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212249() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 1, 12, 63, 202, 496, 1034});
  }
}
