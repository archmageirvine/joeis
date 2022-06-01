package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292326 p-INVERT of (1,1,1,0,0,0,0,0,0,0,0,...), where p(S) = (1 - S)^3.
 * @author Sean A. Irvine
 */
public class A292326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292326() {
    super(new long[] {1, 3, 6, 4, 0, -6, -2, 0, 3}, new long[] {3, 9, 25, 63, 153, 359, 819, 1830, 4018});
  }
}
