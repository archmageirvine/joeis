package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212984 Number of (w,x,y) with all terms in <code>{0</code>..n} and 3w = x+y.
 * @author Sean A. Irvine
 */
public class A212984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212984() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 1, 3, 6, 8});
  }
}
