package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212089 Number of (w,x,y,z) with all terms in {1,...,n} and w&gt;=average{x,y,z}.
 * @author Sean A. Irvine
 */
public class A212089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212089() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 1, 9, 45, 139, 333, 684});
  }
}
