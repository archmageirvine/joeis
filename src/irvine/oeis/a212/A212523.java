package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212523 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and w+x&lt;y+z.
 * @author Sean A. Irvine
 */
public class A212523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212523() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 5, 31, 106});
  }
}
