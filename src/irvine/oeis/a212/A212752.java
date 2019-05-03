package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212752 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and at least one of these conditions holds: w&lt;R, x&lt;R, y&lt;R, z&gt;R, where <code>R=max{w,x,y,z}-min{w,x,y,z}</code>.
 * @author Sean A. Irvine
 */
public class A212752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212752() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 14, 71, 238, 580, 1224, 2265, 3896});
  }
}
