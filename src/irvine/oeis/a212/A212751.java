package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212751 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and at least one of these conditions holds: <code>w=R, x=R, y=R</code>, z&lt;R, where R <code>= max{w,x,y,z} - min{w,x,y,z}</code>.
 * @author Sean A. Irvine
 */
public class A212751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212751() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 14, 70, 198, 477, 924, 1696, 2768});
  }
}
