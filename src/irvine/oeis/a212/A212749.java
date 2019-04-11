package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212749 Number of (w,x,y,z) with all terms in <code>{0,</code>...,n} and at least one of these conditions holds: w=R, x&lt;R, y&lt;R, z&lt;R, where R = max{w,x,y,z} - min{w,x,y,z}.
 * @author Sean A. Irvine
 */
public class A212749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212749() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 14, 70, 222, 537, 1116, 2056, 3512});
  }
}
