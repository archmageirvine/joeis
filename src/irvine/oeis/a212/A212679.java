package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212679 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and <code>|x-y|=|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212679() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 8, 33, 80, 165});
  }
}
