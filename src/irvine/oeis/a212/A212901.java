package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212901 Number of (w,x,y,z) with all terms in {0,...,n} and equal consecutive gap sizes.
 * @author Sean A. Irvine
 */
public class A212901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212901() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 4, 13, 26, 45, 66});
  }
}
