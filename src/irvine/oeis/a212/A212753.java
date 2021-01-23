package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212753 Number of (w,x,y,z) with all terms in {0,...,n} and at least one of these conditions holds: w&lt;R, x&lt;R, y&gt;R, z&gt;R, where R = max{w,x,y,z} - min{w,x,y,z}.
 * @author Sean A. Irvine
 */
public class A212753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212753() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 12, 69, 228, 568, 1192});
  }
}
