package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212979 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and range=average.
 * @author Sean A. Irvine
 */
public class A212979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212979() {
    super(new long[] {1, -2, 2, -2, 1, -1, 2, -2, 2}, new long[] {1, 1, 1, 7, 10, 13, 19, 25, 34});
  }
}
