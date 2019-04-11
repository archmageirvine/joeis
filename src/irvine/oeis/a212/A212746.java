package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212746 Number of (w,x,y,z) with all terms in <code>{0,...,n}</code> and at least one of them is the range of {w,x,y,z}.
 * @author Sean A. Irvine
 */
public class A212746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212746() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 15, 79, 225, 529, 975, 1711});
  }
}
