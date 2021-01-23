package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212088 Number of (w,x,y,z) with all terms in {1,...,n} and w&lt;average{x,y,z}.
 * @author Sean A. Irvine
 */
public class A212088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212088() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 7, 36, 117, 292, 612});
  }
}
