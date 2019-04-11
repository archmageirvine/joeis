package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212509 Number of (w,x,y,z) with all terms in <code>{1,</code>...,n} and w&lt;2x and y&lt;=3z.
 * @author Sean A. Irvine
 */
public class A212509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212509() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 1, 12, 63, 180, 437, 891, 1628, 2736, 4392, 6600, 9646, 13608, 18669, 24990, 32955});
  }
}
