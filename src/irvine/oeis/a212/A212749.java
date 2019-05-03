package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212749 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and at least one of these conditions holds: <code>w=R</code>, x&lt;R, y&lt;R, z&lt;R, where R <code>= max{w,x,y,z} - min{w,x,y,z}</code>.
 * @author Sean A. Irvine
 */
public class A212749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212749() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 14, 70, 222, 537, 1116, 2056, 3512});
  }
}
