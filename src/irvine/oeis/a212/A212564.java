package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212564 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w+x&gt;2y+2z.
 * @author Sean A. Irvine
 */
public class A212564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212564() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 0, 3, 16, 48, 114});
  }
}
