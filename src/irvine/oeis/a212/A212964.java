package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212964 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and |w-x| &lt; |x-y| &lt; |y-w|.
 * @author Sean A. Irvine
 */
public class A212964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212964() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 0, 2, 6});
  }
}
