package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212754 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and at least one of these conditions holds: w&lt;R, x&gt;R, y&gt;R, z&gt;R, where R <code>= max{w,x,y,z} - min{w,x,y,z}</code>.
 * @author Sean A. Irvine
 */
public class A212754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212754() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 8, 53, 184, 472, 1008});
  }
}
