package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213491 Number of (w,x,y) with all terms in {0,...,n} and the numbers w,x,y,|w-x|,|x-y| not distinct.
 * @author Sean A. Irvine
 */
public class A213491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213491() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {1, 8, 27, 64, 125, 204, 305, 420, 569});
  }
}
