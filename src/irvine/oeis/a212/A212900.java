package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212900 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and distinct consecutive gap sizes.
 * @author Sean A. Irvine
 */
public class A212900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212900() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {0, 4, 28, 122, 340, 786, 1558, 2814, 4690});
  }
}
