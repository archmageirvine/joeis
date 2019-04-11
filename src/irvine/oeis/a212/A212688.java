package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212688 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and 2|w-x|&gt;=n+|y-z|.
 * @author Sean A. Irvine
 */
public class A212688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212688() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 4, 14, 44, 98, 200});
  }
}
